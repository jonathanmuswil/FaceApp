import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.t;

public final class mr
  implements a
{
  public final PendingIntent a(f paramf, HintRequest paramHintRequest)
  {
    t.a(paramf, "client must not be null");
    t.a(paramHintRequest, "request must not be null");
    Mp.a locala = ((or)paramf.a(Mp.a)).B();
    return nr.a(paramf.f(), locala, paramHintRequest);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */