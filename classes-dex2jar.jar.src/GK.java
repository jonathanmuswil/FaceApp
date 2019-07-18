import android.content.Context;
import android.os.Looper;
import java.io.File;
import java.io.IOException;

class gk
{
  final Context a;
  final Dca b;
  
  public gk(Context paramContext, Dca paramDca)
  {
    this.a = paramContext;
    this.b = paramDca;
  }
  
  public Ak a()
    throws IOException
  {
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      Hk localHk = new Hk();
      Hba localHba = new Hba();
      Object localObject = this.b.a();
      localObject = new oca(this.a, (File)localObject, "session_analytics.tap", "session_analytics_to_send");
      return new Ak(this.a, localHk, localHba, (kca)localObject);
    }
    throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */