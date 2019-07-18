import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.ArrayList;
import java.util.Collection;

public final class _oa
{
  public static final _oa a = new _oa();
  
  private final String a(Integer[] paramArrayOfInteger, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfInteger.length);
    int i = paramArrayOfInteger.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(Character.valueOf((char)(paramArrayOfInteger[j].intValue() - paramInt)));
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String b()
  {
    return a(new Integer[] { Integer.valueOf(108), Integer.valueOf(127), Integer.valueOf(112), Integer.valueOf(123) }, 7);
  }
  
  private final String c()
  {
    Integer localInteger1 = Integer.valueOf(131);
    Integer localInteger2 = Integer.valueOf(80);
    return a(new Integer[] { Integer.valueOf(140), localInteger1, Integer.valueOf(152), localInteger1, localInteger2, Integer.valueOf(142), localInteger1, Integer.valueOf(144), Integer.valueOf(137), localInteger2, Integer.valueOf(117), Integer.valueOf(155), Integer.valueOf(149), Integer.valueOf(150), Integer.valueOf(135), Integer.valueOf(143) }, 34);
  }
  
  public final void a()
  {
    EVa.b().a(Zoa.a);
  }
  
  public final boolean a(Context paramContext)
  {
    oXa.b(paramContext, "context");
    boolean bool;
    if ((paramContext.getApplicationInfo().flags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_oa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */