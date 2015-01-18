package org.droidplanner.pebble;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Autostart extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent arg) {
        Intent intent = new Intent(context, PebbleCommunicatorService.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startService(intent);
    }
}
