import android.content.Context;
import android.content.pm.ApplicationInfo;
import io.faceapp.FaceApplication;
import io.faceapp.FaceApplication.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public final class bpa
{
  private static kRa a;
  public static final bpa b = new bpa();
  
  private final String a()
  {
    return a(new long[] { 106L, 125L, 110L, 121L }, -5);
  }
  
  private final String a(long[] paramArrayOfLong, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfLong.length);
    int i = paramArrayOfLong.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(Character.valueOf((char)(int)(paramArrayOfLong[j] + paramInt)));
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final boolean a(Context paramContext, String paramString)
  {
    int i = paramContext.getApplicationInfo().flags;
    boolean bool = true;
    if ((i & 0x2) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (paramString.length() > 0) {
      j = 1;
    } else {
      j = 0;
    }
    if ((j == 0) || (i == 0)) {
      bool = false;
    }
    return bool;
  }
  
  private final String b()
  {
    return a(new long[] { 81L, 72L, 93L, 72L, 21L, 83L, 72L, 85L, 78L, 21L, 58L, 96L, 90L, 91L, 76L, 84L }, 25);
  }
  
  public final void a(String paramString)
  {
    oXa.b(paramString, "nonEmptySalt");
    Context localContext = FaceApplication.d.a();
    a = XQa.a(2L, TimeUnit.SECONDS, EVa.b()).d(new apa(localContext, paramString));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bpa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */