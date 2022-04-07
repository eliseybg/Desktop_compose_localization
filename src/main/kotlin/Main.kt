import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import localization.Localization
import localization.Vocabulary
import localization.languages.LanguageEn
import localization.languages.LanguageRu
import localization.rememberLocalization

fun main() = application {
    Localization {
        MaterialTheme {
            Window(onCloseRequest = ::exitApplication) {
                val currentLanguage = Vocabulary.localization
                Box {
                    Button(onClick = {
                        when (currentLanguage) {
                            is LanguageRu -> {
                                rememberLocalization(LanguageEn)
                            }
                            is LanguageEn -> {
                                rememberLocalization(LanguageRu)
                            }
                        }
                    }) {
                        Text(Vocabulary.localization.currentLanguage)
                    }
                    Column(
                        modifier = Modifier.padding(16.dp).fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = Vocabulary.localization.title,
                            textAlign = TextAlign.Center,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(100.dp))
                        Column(
                            modifier = Modifier
                                .width(300.dp)
                                .animateContentSize()
                                .clip(RoundedCornerShape(15.dp))
                                .background(Color.White)
                                .padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                modifier = Modifier.height(130.dp),
                                contentScale = ContentScale.Fit,
                                painter = painterResource("avocado.png"),
                                contentDescription = ""
                            )
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 10.dp),
                                text = Vocabulary.localization.name,
                                textAlign = TextAlign.Center,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                modifier = Modifier.fillMaxWidth(),
                                text = Vocabulary.localization.description,
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal
                            )
                        }
                    }
                }
            }
        }
    }
}
