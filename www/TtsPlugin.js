var exec = require('cordova/exec');
/**
 * Constructor
 */
function TtsPlugin() {}

TtsPlugin.prototype.initTTS = function() {
    exec(function(result){
        },
        function(error){
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