import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

public final class ipa
{
  private static final QVa b = RVa.a(gpa.b);
  public static final ipa c;
  
  static
  {
    rXa localrXa = new rXa(vXa.a(ipa.class), "GOOGLE_PLAY_INSTALLER", "getGOOGLE_PLAY_INSTALLER()Ljava/lang/String;");
    vXa.a(localrXa);
    a = new XXa[] { localrXa };
    c = new ipa();
  }
  
  private final String a()
  {
    Integer localInteger1 = Integer.valueOf(82);
    Integer localInteger2 = Integer.valueOf(17);
    Integer localInteger3 = Integer.valueOf(81);
    Integer localInteger4 = Integer.valueOf(71);
    Integer localInteger5 = Integer.valueOf(76);
    return a(new Integer[] { Integer.valueOf(70), localInteger1, Integer.valueOf(80), localInteger2, Integer.valueOf(68), localInteger3, localInteger4, Integer.valueOf(85), localInteger1, localInteger5, localInteger4, localInteger2, Integer.valueOf(89), Integer.valueOf(72), localInteger3, localInteger4, localInteger5, localInteger3, Integer.valueOf(74) }, 29);
  }
  
  private final String a(Integer[] paramArrayOfInteger, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfInteger.length);
    int i = paramArrayOfInteger.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(Character.valueOf((char)(paramArrayOfInteger[j].intValue() + paramInt)));
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  public final XQa<Boolean> a(Context paramContext, String paramString)
  {
    oXa.b(paramContext, "context");
    oXa.b(paramString, "saltLength2");
    paramContext = XQa.a(new hpa(paramContext, paramString)).b(EVa.b());
    oXa.a(paramContext, "Single.defer {\n        i…)\n    }.subscribeOn(io())");
    return paramContext;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ipa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */