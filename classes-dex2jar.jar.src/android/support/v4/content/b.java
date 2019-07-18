package android.support.v4.content;

import Hc;
import Kc;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

public final class b
{
  public static Cursor a(ContentResolver paramContentResolver, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, Hc paramHc)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      if (paramHc != null) {
        try
        {
          paramHc = paramHc.b();
        }
        catch (Exception paramContentResolver)
        {
          break label49;
        }
      } else {
        paramHc = null;
      }
      paramContentResolver = paramContentResolver.query(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, (CancellationSignal)paramHc);
      return paramContentResolver;
      label49:
      if ((paramContentResolver instanceof OperationCanceledException)) {
        throw new Kc();
      }
      throw paramContentResolver;
    }
    if (paramHc != null) {
      paramHc.d();
    }
    return paramContentResolver.query(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/content/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */