import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class lEa<T, R>
  implements DRa<Object[], R>
{
  public static final lEa a = new lEa();
  
  public final List<AEa.c> a(Object[] paramArrayOfObject)
  {
    oXa.b(paramArrayOfObject, "it");
    ArrayList localArrayList = new ArrayList(paramArrayOfObject.length);
    int i = paramArrayOfObject.length;
    int j = 0;
    while (j < i)
    {
      Object localObject = paramArrayOfObject[j];
      if (localObject != null)
      {
        localArrayList.add((AEa.c)localObject);
        j++;
      }
      else
      {
        throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.modes.collage.ModeCollageView.PartStatus");
      }
    }
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lEa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */