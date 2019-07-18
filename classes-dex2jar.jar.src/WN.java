import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

class wn
  implements Runnable
{
  wn(xn.a parama, String paramString, Bundle paramBundle) {}
  
  public void run()
  {
    AppEventsLogger.newLogger(FacebookSdk.d()).a(this.a, this.b);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */