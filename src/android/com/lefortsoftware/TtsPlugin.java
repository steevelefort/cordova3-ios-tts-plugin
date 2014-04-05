    package com.lefortsoftware.ttsplugin;

        import org.apache.cordova.CallbackContext;
        import org.apache.cordova.CordovaPlugin;
        import org.json.JSONArray;
        import org.json.JSONException;

        import android.speech.tts.TextToSpeech;
        import java.util.Locale;

        import android.widget.Toast;

        public class TtsPlugin extends CordovaPlugin{

        TextToSpeech tts;
        CallbackContext cbc;

        @Override
        public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        cbc = callbackContext;

        if(action.equals("echo")){
        String message = args.getString(0);
        callbackContext.success(message);
        return true;
        }

        if(action.equals("initTTS")){
        tts = new TextToSpeech(cordova.getActivity().getApplicationContext(), new TextToSpeech.OnInitListener()
        {
        @Override
        public void onInit(int status) {
        if(status == TextToSpeech.SUCCESS)
        {
        //Toast.makeText(cordova.getActivity().getApplicationContext(), "Init OK", Toast.LENGTH_LONG).show();
        cbc.success();
        }
        else
        {
        //Toast.makeText(cordova.getActivity().getApplicationContext(), "ERROR", Toast.LENGTH_LONG).show();
        cbc.error("ERROR");
        }
        }
        } );
        return true;
        }

        if(action.equals("speak")){
        String txt = args.getString(0);
        tts.setLanguage(Locale.FRANCE);
        tts.speak(txt, TextToSpeech.QUEUE_ADD, null);
        callbackContext.success("OK");
        return true;
        }

        if(action.equals("stop")){
        tts.stop();
        callbackContext.success("OK");
        return true;
        }

        if(action.equals("setLanguage")){
        callbackContext.success("OK");
        return true;
        }

        if(action.equals("setRate")){
        callbackContext.success("OK");
        return true;
        }

        callbackContext.success(action);
        return true;
        }
        }