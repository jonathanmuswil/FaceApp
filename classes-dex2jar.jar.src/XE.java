import android.content.Context;
import android.util.Log;
import io.faceapp.services.glide.FaceappGlideModule;
import java.util.Collections;
import java.util.Set;

final class xe
  extends we
{
  private final FaceappGlideModule a = new FaceappGlideModule();
  
  xe()
  {
    if (Log.isLoggable("Glide", 3)) {
      Log.d("Glide", "Discovered AppGlideModule from annotation: io.faceapp.services.glide.FaceappGlideModule");
    }
  }
  
  public void a(Context paramContext, Ae paramAe, Ge paramGe)
  {
    this.a.a(paramContext, paramAe, paramGe);
  }
  
  public void a(Context paramContext, Be paramBe)
  {
    this.a.a(paramContext, paramBe);
  }
  
  public boolean a()
  {
    return this.a.a();
  }
  
  public Set<Class<?>> b()
  {
    return Collections.emptySet();
  }
  
  ye c()
  {
    return new ye();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */