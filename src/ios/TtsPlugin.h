#import <Cordova/CDV.h>
#import <AVFoundation/AVFoundation.h>

@interface TtsPlugin : CDVPlugin

- (void)initTTS:(CDVInvokedUrlCommand*)command;
- (void)setRate:(CDVInvokedUrlCommand*)command;
- (void)setLanguage:(CDVInvokedUrlCommand*)command;
- (void)speak:(CDVInvokedUrlCommand*)command;
- (void)stop:(CDVInvokedUrlCommand*)command;

@end