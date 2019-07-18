import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

 enum oba$a
{
  private static final Map<String, a> k;
  
  static
  {
    k = new HashMap(4);
    k.put("armeabi-v7a", g);
    k.put("armeabi", f);
    k.put("arm64-v8a", j);
    k.put("x86", a);
  }
  
  private oba$a() {}
  
  static a a()
  {
    Object localObject = Build.CPU_ABI;
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      Naa.e().d("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
      return h;
    }
    localObject = ((String)localObject).toLowerCase(Locale.US);
    a locala = (a)k.get(localObject);
    localObject = locala;
    if (locala == null) {
      localObject = h;
    }
    return (a)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oba$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */