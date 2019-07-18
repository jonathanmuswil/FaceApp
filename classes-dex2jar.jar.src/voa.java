import java.util.Collection;
import java.util.List;

final class voa<T>
  implements ARa<List<eoa.d>>
{
  public static final voa a = new voa();
  
  public final void a(List<eoa.d> paramList)
  {
    icb.a locala = icb.a("RecentPhotosRepo");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("allRecentPhotos new emit: ");
    oXa.a(paramList, "it");
    localStringBuilder.append(paramList.size());
    localStringBuilder.append(" items");
    locala.a(localStringBuilder.toString(), new Object[0]);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/voa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */