cordova3-ios-tts-plugin
=======================

A very small text to speech plugin for Cordova3 / Ios


INSTALLATION

In your Cordova project directory : 
cordova plugin add https://github.com/steevelefort/cordova3-ios-tts-plugin

Verify if you config.xml file contains :
<feature name="TtsPlugin">
        <param name="ios-package" value="TtsPlugin" />
</feature>

USE IT

ttsPlugin.initTTS(successCallBack, failCallBack); // Init Plugin : failCallBack doesn't work yet
ttsPlugin.speak("Hello"); // Say Hello
