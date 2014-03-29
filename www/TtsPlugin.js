var exec = require('cordova/exec');
/**
 * Constructor
 */
function TtsPlugin() {}

TtsPlugin.prototype.initTTS = function(successCallBack, failCallBack) {
    exec(function(result){
            successCallBack();
        },
        function(error){
            failCallBack();
        },
        "TtsPlugin",
        "initTTS",
        []
    );
}

TtsPlugin.prototype.speak = function(text) {
    exec(function(result){
        },
        function(error){
        },
        "TtsPlugin",
        "speak",
        [text]
    );
}


var ttsPlugin = new TtsPlugin();
module.exports = ttsPlugin