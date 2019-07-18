import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class Dda$a
{
  public final Dda a()
  {
    return Dda.a();
  }
  
  public final Dda a(String paramString1, String paramString2, String paramString3)
  {
    oXa.b(paramString1, "serialized");
    oXa.b(paramString2, "separator");
    oXa.b(paramString3, "subSeparator");
    paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
    String str = (String)paramString1.get(0);
    ArrayList localArrayList = new ArrayList(paramString1.size() - 1);
    paramString2 = NXa.d(1, paramString1.size()).iterator();
    while (paramString2.hasNext())
    {
      int i = ((CWa)paramString2).nextInt();
      localArrayList.add(bfa.Companion.deserialize((String)paramString1.get(i), paramString3));
    }
    return new Dda(str, localArrayList);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Dda$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */