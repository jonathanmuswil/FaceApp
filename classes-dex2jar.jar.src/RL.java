import android.os.Build;
import java.util.HashMap;

class rl
  extends HashMap<String, Object>
{
  rl(sl paramsl)
  {
    put("arch", Integer.valueOf(this.a.a));
    put("build_model", Build.MODEL);
    put("available_processors", Integer.valueOf(this.a.b));
    put("total_ram", Long.valueOf(this.a.c));
    put("disk_space", Long.valueOf(this.a.d));
    put("is_emulator", Boolean.valueOf(this.a.e));
    put("ids", this.a.f);
    put("state", Integer.valueOf(this.a.g));
    put("build_manufacturer", Build.MANUFACTURER);
    put("build_product", Build.PRODUCT);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */