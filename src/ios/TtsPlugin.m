#import "TtsPlugin.h"
#import <Cordova/CDV.h>

@implementation TtsPlugin

AVSpeechSynthesizer *synth;
double rate = .2;

- (void)initTTS:(CDVInvokedUrlCommand*)command{
    synth = [[AVSpeechSynthesizer alloc] init];
    CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:@"OK"];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

- (void)speak:(CDVInvokedUrlCommand*)command{
    NSString* text = [command.arguments objectAtIndex:0];
    AVSpeechUtterance *utterance = [AVSpeechUtterance speechUtteranceWithString:text];
    utterance.rate = rate;
    [synth speakUtterance:utterance];
    CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:text];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end