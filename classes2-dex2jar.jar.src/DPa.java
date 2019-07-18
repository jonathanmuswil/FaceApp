import android.content.Context;
import android.content.pm.ApplicationInfo;
import io.faceapp.FaceApplication;
import io.faceapp.FaceApplication.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public final class dpa
{
  private static kRa a;
  public static final dpa b = new dpa();
  
  private final String a()
  {
    return a(new Integer[] { Integer.valueOf(56), Integer.valueOf(75), Integer.valueOf(60), Integer.valueOf(71) }, -45);
  }
  
  private final String a(Integer[] paramArrayOfInteger, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfInteger.length);
    int i = paramArrayOfInteger.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(Character.valueOf((char)(paramArrayOfInteger[j].intValue() - paramInt)));
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final boolean a(Context paramContext, int paramInt)
  {
    int i = paramContext.getApplicationInfo().flags;
    boolean bool = true;
    if ((i & 0x2) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i == 0) || (paramInt <= 0)) {
      bool = false;
    }
    return bool;
  }
  
  private final String b()
  {
    Integer localInteger1 = Integer.valueOf(81);
    Integer localInteger2 = Integer.valueOf(30);
    return a(new Integer[] { Integer.valueOf(90), localInteger1, Integer.valueOf(102), localInteger1, localInteger2, Integer.valueOf(92), localInteger1, Integer.valueOf(94), Integer.valueOf(87), localInteger2, Integer.valueOf(67), Integer.valueOf(105), Integer.valueOf(99), Integer.valueOf(100), Integer.valueOf(85), Integer.valueOf(93) }, -16);
  }
  
  public final void a(int paramInt)
  {
    Context localContext = FaceApplication.d.a();
    a = XQa.a(paramInt % 4889 + 7000, TimeUnit.MILLISECONDS, EVa.b()).d(new cpa(localContext, paramInt));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dpa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */