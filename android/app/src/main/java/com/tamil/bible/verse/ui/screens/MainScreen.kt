package com.tamil.bible.verse.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tamil.bible.verse.data.VerseRepository
import com.tamil.bible.verse.data.BibleVerse

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    var selectedVerse by remember { mutableStateOf(VerseRepository.verses.first()) }
    var selectedTopic by remember { mutableStateOf("all") }
    var isEnglish by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(if (isEnglish) "Tamil Daily Bible Verse" else "தினசரி தமிழ் வேத வசனம்", fontWeight = FontWeight.Bold) },
                actions = {
                    TextButton(onClick = { isEnglish = !isEnglish }) {
                        Text(if (isEnglish) "தமிழ்" else "EN", color = MaterialTheme.colorScheme.primary)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Badge { Text(selectedVerse.topicTa) }
                            Button(
                                onClick = {
                                    val filtered = if (selectedTopic == "all") VerseRepository.verses else VerseRepository.verses.filter { it.topic == selectedTopic }
                                    selectedVerse = filtered.random()
                                },
                                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                            ) {
                                Text(if (isEnglish) "New Verse" else "புதிய வசனம்")
                            }
                        }

                        Text(
                            text = if (isEnglish) selectedVerse.textEn else selectedVerse.textTa,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Medium,
                            lineHeight = 28.sp
                        )

                        Text(
                            text = "— ${if (isEnglish) selectedVerse.refEn else selectedVerse.refTa}",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.primary
                        )
                    }
                }
            }
        }
    }
}
