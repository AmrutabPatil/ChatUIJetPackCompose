package com.example.chatuijetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chatuijetpackcompose.ui.theme.ChatUIJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ChatUIJetpackComposeTheme{
                MessageBox("HELLO WORLD")
            }
            }

    }
}

@Composable
fun MessageBox(name:String){


    Row{
Image(painter= painterResource(id = R.drawable.profile_img),
    contentDescription = "Profile Picture",
    modifier = Modifier
        .size(40.dp)
        .clip(CircleShape)
        .border(1.5.dp, MaterialTheme.colorScheme.secondary,
            CircleShape)
)
        Spacer(modifier = Modifier.height(4.dp))


        Column {
            Text("Welcome $name",
                color=MaterialTheme.colorScheme.secondary,
            style= MaterialTheme.typography.labelMedium)
            Spacer(modifier = Modifier.height(4.dp))
            Text("Welcome $name",

                    color=MaterialTheme.colorScheme.secondary,
                    style= MaterialTheme.typography.bodyLarge)
        }
    }


}

@Preview
@Composable
fun PreviewMessageBox(){

    ChatUIJetpackComposeTheme {
        MessageBox(name = "JetPack Compose")
    }
}

