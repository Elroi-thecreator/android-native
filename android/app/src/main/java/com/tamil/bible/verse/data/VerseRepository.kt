package com.tamil.bible.verse.data

data class BibleVerse(
    val id: String,
    val topic: String,
    val topicTa: String,
    val refTa: String,
    val refEn: String,
    val textTa: String,
    val textEn: String,
    val reflectionTa: String
)

object VerseRepository {
    val verses = listOf(
        BibleVerse(
            id = "peace-1",
            topic = "peace",
            topicTa = "சமாதானம்",
            refTa = "யோவான் 14:27",
            refEn = "John 14:27",
            textTa = "சமாதானத்தை உங்களுக்கு வைத்துப்போகிறேன், என்னுடைய சமாதானத்தையே உங்களுக்குக் கொடுக்கிறேன்; உலகம் கொடுக்கிறபிரகாரம் நான் உங்களுக்குக் கொடுக்கிறதில்லை. உங்கள் இருதயம் கலங்காமலும் பயப்படாமலும் இருப்பதாக.",
            textEn = "Peace I leave with you; my peace I give you.",
            reflectionTa = "உலகத்தின் கவலைகளுக்கு மத்தியில் இயேசு அருளும் தெய்வீக சமாதானம் உங்கள் இதயத்தை ஆளுகை செய்யட்டும்."
        ),
        BibleVerse(
            id = "trust-1",
            topic = "trust",
            topicTa = "நம்பிக்கை",
            refTa = "நீதிமொழிகள் 3:5-6",
            refEn = "Proverbs 3:5-6",
            textTa = "உன் சுயபுத்தியின்மேல் சாயாமல், உன் முழு இருதயத்தோடும் கர்த்தரில் நம்பிக்கையாயிருந்து; உன் வழிகளிலெல்லாம் அவரை நினைத்துக்கொள்; அப்பொழுது அவர் உன் பாதைகளைச் செவ்வைப்படுத்துவார்.",
            textEn = "Trust in the Lord with all your heart...",
            reflectionTa = "மனிதனின் சுயபுத்தி குறுகியது. கர்த்தரை முழுமையாக நம்பும்போது அவர் நம் பாதையைச் சீராக்குவார்."
        ),
        BibleVerse(
            id = "courage-1",
            topic = "courage",
            topicTa = "தைரியம்",
            refTa = "யோசுவா 1:9",
            refEn = "Joshua 1:9",
            textTa = "நான் உனக்குக் கட்டளையிடவில்லையா? பலங்கொண்டு திடமனதாயிரு; திகையாதே, கலங்காதே, நீ போகும் இடமெல்லாம் உன் தேவனாகிய கர்த்தர் உன்னோடே இருக்கிறார்.",
            textEn = "Be strong and courageous...",
            reflectionTa = "எந்த சவாலையும் எதிர்கொள்ள அஞ்சாதீர்கள்; சர்வவல்லமையுள்ள தேவன் உங்களுடனே இருக்கிறார்."
        )
    )
}
