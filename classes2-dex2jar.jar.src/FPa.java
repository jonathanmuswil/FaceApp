import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class fpa
{
  private static final QVa b = RVa.a(epa.b);
  public static final fpa c;
  
  static
  {
    rXa localrXa = new rXa(vXa.a(fpa.class), "GOOGLE_PLAY_INSTALLER", "getGOOGLE_PLAY_INSTALLER()Ljava/lang/String;");
    vXa.a(localrXa);
    a = new XXa[] { localrXa };
    c = new fpa();
  }
  
  private final String a(List<Integer> paramList, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(Character.valueOf((char)(((Number)paramList.next()).intValue() - paramInt)));
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String b()
  {
    Integer localInteger1 = Integer.valueOf(126);
    Integer localInteger2 = Integer.valueOf(61);
    Integer localInteger3 = Integer.valueOf(125);
    Integer localInteger4 = Integer.valueOf(115);
    Integer localInteger5 = Integer.valueOf(120);
    return a(mWa.b(new Integer[] { Integer.valueOf(114), localInteger1, Integer.valueOf(124), localInteger2, Integer.valueOf(112), localInteger3, localInteger4, Integer.valueOf(129), localInteger1, localInteger5, localInteger4, localInteger2, Integer.valueOf(133), Integer.valueOf(116), localInteger3, localInteger4, localInteger5, localInteger3, Integer.valueOf(118) }), 15);
  }
  
  public final void a() {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fpa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */