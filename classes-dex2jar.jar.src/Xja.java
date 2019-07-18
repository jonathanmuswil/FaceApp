import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import java.util.List;

final class xja<T>
  implements ARa<Boolean>
{
  xja(Aja paramAja) {}
  
  public final void a(Boolean paramBoolean)
  {
    Object localObject = this.a.b();
    if (localObject != null) {
      localObject = ((Camera)localObject).getParameters();
    } else {
      localObject = null;
    }
    if (localObject != null)
    {
      List localList = ((Camera.Parameters)localObject).getSupportedFlashModes();
      String str = "on";
      if (localList.contains("on"))
      {
        oXa.a(paramBoolean, "enabled");
        if (paramBoolean.booleanValue()) {
          paramBoolean = str;
        } else {
          paramBoolean = "off";
        }
        ((Camera.Parameters)localObject).setFlashMode(paramBoolean);
        paramBoolean = this.a.b();
        if (paramBoolean != null) {
          paramBoolean.setParameters((Camera.Parameters)localObject);
        }
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */