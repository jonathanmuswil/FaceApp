import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Naa$a
{
  private final Context a;
  private Uaa[] b;
  private _ba c;
  private Handler d;
  private Xaa e;
  private boolean f;
  private String g;
  private String h;
  private Raa<Naa> i;
  
  public Naa$a(Context paramContext)
  {
    if (paramContext != null)
    {
      this.a = paramContext;
      return;
    }
    throw new IllegalArgumentException("Context must not be null.");
  }
  
  public a a(Xaa paramXaa)
  {
    if (paramXaa != null)
    {
      if (this.e == null)
      {
        this.e = paramXaa;
        return this;
      }
      throw new IllegalStateException("Logger already set.");
    }
    throw new IllegalArgumentException("Logger must not be null.");
  }
  
  public a a(Uaa... paramVarArgs)
  {
    if (this.b == null)
    {
      Object localObject = paramVarArgs;
      if (!rba.a(this.a).a())
      {
        ArrayList localArrayList = new ArrayList();
        int j = paramVarArgs.length;
        int k = 0;
        int n;
        for (int m = 0; k < j; m = n)
        {
          Uaa localUaa = paramVarArgs[k];
          localObject = localUaa.h();
          n = -1;
          int i1 = ((String)localObject).hashCode();
          if (i1 != 607220212)
          {
            if ((i1 == 1830452504) && (((String)localObject).equals("com.crashlytics.sdk.android:crashlytics"))) {
              n = 0;
            }
          }
          else if (((String)localObject).equals("com.crashlytics.sdk.android:answers")) {
            n = 1;
          }
          if ((n != 0) && (n != 1))
          {
            n = m;
            if (m == 0)
            {
              Naa.e().a("Fabric", "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
              n = 1;
            }
          }
          else
          {
            localArrayList.add(localUaa);
            n = m;
          }
          k++;
        }
        localObject = (Uaa[])localArrayList.toArray(new Uaa[0]);
      }
      this.b = ((Uaa[])localObject);
      return this;
    }
    throw new IllegalStateException("Kits already set.");
  }
  
  public Naa a()
  {
    if (this.c == null) {
      this.c = _ba.a();
    }
    if (this.d == null) {
      this.d = new Handler(Looper.getMainLooper());
    }
    if (this.e == null) {
      if (this.f) {
        this.e = new Kaa(3);
      } else {
        this.e = new Kaa();
      }
    }
    if (this.h == null) {
      this.h = this.a.getPackageName();
    }
    if (this.i == null) {
      this.i = Raa.a;
    }
    Object localObject = this.b;
    if (localObject == null) {
      localObject = new HashMap();
    } else {
      localObject = Naa.a(Arrays.asList((Object[])localObject));
    }
    Context localContext = this.a.getApplicationContext();
    Bba localBba = new Bba(localContext, this.h, this.g, ((Map)localObject).values());
    return new Naa(localContext, (Map)localObject, this.c, this.d, this.e, this.f, this.i, localBba, Naa.a(this.a));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Naa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */