import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.t;

public final class nr
{
  public static PendingIntent a(Context paramContext, Mp.a parama, HintRequest paramHintRequest)
  {
    t.a(paramContext, "context must not be null");
    t.a(paramHintRequest, "request must not be null");
    parama = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", null);
    jq.a(paramHintRequest, parama, "com.google.android.gms.credentials.HintRequest");
    return PendingIntent.getActivity(paramContext, 2000, parama, 134217728);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */