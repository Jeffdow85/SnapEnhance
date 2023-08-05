package me.rhunk.snapenhance.core.config.impl

import me.rhunk.snapenhance.core.config.ConfigContainer
import me.rhunk.snapenhance.features.impl.tweaks.CameraTweaks

class Camera : ConfigContainer() {
    val disable = boolean("disable_camera")
    val immersiveCameraPreview = boolean("immersive_camera_preview")
    val overridePreviewResolution = unique("override_preview_resolution", *CameraTweaks.resolutions.toTypedArray())
        { shouldTranslate = false }
    val overridePictureResolution = unique("override_picture_resolution", *CameraTweaks.resolutions.toTypedArray())
        { shouldTranslate = false }
    val forceHighestFrameRate = boolean("force_highest_frame_rate")
    val forceCameraSourceEncoding = boolean("force_camera_source_encoding")
}