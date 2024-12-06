package by.marcel.face_apps_detection.result

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.marcel.face_apps_detection.R
import by.marcel.face_apps_detection.databinding.ActivityResultBinding
import com.canhub.cropper.CropImage

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding
    private lateinit var currentImageUri: Uri

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent?.getStringExtra(EXTRA_IMAGE_URI)?.let { uriString ->
            currentImageUri = Uri.parse(uriString)
            binding.resultImage.setImageURI(currentImageUri)
        }

        val resultText = intent.getStringExtra(EXTRA_RESULT)
        resultText?.let {
            binding.resultText.text = it
        }
    }

    companion object {
        const val EXTRA_IMAGE_URI = "extra_image_uri"
        const val EXTRA_RESULT = "extra_result"
        const val EXTRA_CONFIDENCE_SCORE = "extra_confidence_score"

    }

}