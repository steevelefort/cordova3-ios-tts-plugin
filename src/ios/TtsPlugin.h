#import <Cordova/CDV.h>
#import <AVFoundation/AVFoundation.h>

@interface TtsPlugin : CDVPlugin

- (void)initTTS:(CDVInvokedUrlCommand*)command;
- (void)speak:(CDVInvokedUrlCommand*)command;

@end