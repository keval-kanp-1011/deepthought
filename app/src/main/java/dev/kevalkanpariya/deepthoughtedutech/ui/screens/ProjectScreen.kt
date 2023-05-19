package dev.kevalkanpariya.deepthoughtedutech.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter

@Preview
@Composable
fun ProjectScreen(
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {

        Text(text = "Projects")

    }
}

@Composable
fun Data(
    imageLoader: ImageLoader
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = rememberAsyncImagePainter(
                imageLoader = imageLoader,
                model = ""
            ),
            contentDescription = "project Image"
        )
        Column(

        ) {
            Text(
                text = "shortDescription",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = "description"
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Learning Outcome",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = "learning_outcome"
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Pre-Requisites",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = "pre_requisites"
            )

        }
        Column() {
            Text(text = "category By", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Row(

            ) {
                Image(
                    painter = rememberAsyncImagePainter(
                        model = "",
                        imageLoader = imageLoader
                    ),
                    contentDescription = "logo"
                )
                Column() {
                    Text(text = "SURAJ", fontSize = 18.sp, fontWeight = FontWeight.Medium)
                    Text(text = "DeepThought", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                }

            }
            Row() {
                Button(
                    onClick = {

                              },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0XFF0029FF)),
                    modifier = Modifier.clip(RoundedCornerShape(4.dp))
                ) {
                    Text(text = "Explore", color = Color.White)
                }
            }
        }

    }
}