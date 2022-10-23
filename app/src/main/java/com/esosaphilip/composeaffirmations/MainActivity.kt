package com.esosaphilip.composeaffirmations


import android.graphics.Color.red
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.esosaphilip.composeaffirmations.data.Ballers
import com.esosaphilip.composeaffirmations.data.Datasource
import com.esosaphilip.composeaffirmations.ui.theme.ComposeAffirmationsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    BallersProfile()
        }
    }
}

@Composable
fun BallersProfile() {
    ComposeAffirmationsTheme {
        Scaffold(
            content = {
              BallersList(ballersList = Datasource().loadBallers())

            }
        )
    }
}

@Composable
private fun BallersList(ballersList: List<Ballers>, modifier: Modifier = Modifier) {
    LazyColumn {
        items(ballersList){ ballers  ->
            BallersCard(ballers)
        }
    }
}
@Composable
fun BallersCard(ballers: Ballers, modifier:Modifier = Modifier){
    Card(modifier = modifier.padding(8.dp),
        elevation = 4.dp) {
        Column() {
            Image(painter = painterResource(ballers.imageResourceId), contentDescription = null,
             modifier = Modifier
                 .fillMaxWidth()
                 .height(194.dp),
                contentScale = ContentScale.Crop)
            Text(text ="Name:  ${ballers.name}",modifier = Modifier.padding(2.dp),
                style = MaterialTheme.typography.h4,color = Color.Green
            )

            Text(text = "Age: ${ballers.age}",modifier = Modifier.padding(6.dp),
                style = MaterialTheme.typography.h5,color = Color.Blue
            )

            Text(text = "Numbers Of Ballon D'Or:      ${ballers.numberOfBallonDor}",
                    modifier = Modifier.padding(6.dp),
                style = MaterialTheme.typography.h6, color = Color.Red
            )
            
        }

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeAffirmationsTheme {
        BallersProfile()
    }
}