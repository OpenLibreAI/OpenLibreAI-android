package ai.openlibre.openlibreai

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.unicornapp.openlibreai.ui.theme.OpenLibreColor

@Composable
fun UpperPanel() {
    Column(
        modifier = Modifier
            .padding(start = 0.dp, end = 0.dp, top = 16.dp, bottom = 16.dp)
            .background(OpenLibreColor.violet)
    ) {
        Text(
            modifier = Modifier.padding(start = 5.dp, end = 5.dp),
            text = stringResource(id = R.string.title),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = OpenLibreColor.yellow
        )
        Text(
            modifier = Modifier.padding(start = 5.dp, end = 5.dp),
            text = stringResource(id = R.string.location),
            fontSize = 24.sp,
            color = OpenLibreColor.cloud
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(
                text = stringResource(id = R.string.description),
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .padding(start = 5.dp, bottom = 28.dp, end = 20.dp)
                    .fillMaxWidth(0.6f),
                color = OpenLibreColor.cloud
            )
            Image(
                painter = painterResource(id = R.drawable.upperpanelimage),
                contentDescription = "Upper Panel Image",
                modifier = Modifier.clip(RoundedCornerShape(10.dp))
            )
        }
        Button(
            modifier = Modifier.padding(start = 5.dp, end = 5.dp),
            onClick = { }
        ) {
            Text(
                text = stringResource(id = R.string.order_button_text)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UpperPanelPreview() {
    UpperPanel()
}
