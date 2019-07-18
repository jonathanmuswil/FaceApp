import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.os.SystemClock;
import com.google.android.gms.vision.a;
import com.google.android.gms.vision.b;
import com.google.android.gms.vision.b.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

final class Aja$b
  implements VQa<WVa<? extends byte[], ? extends Camera>>
{
  private final Map<byte[], ByteBuffer> b = new HashMap();
  private final ArrayList<ByteBuffer> c = new ArrayList(2);
  private final long d = SystemClock.elapsedRealtime();
  private long e;
  private final QVa f = RVa.a(new Bja(this));
  private final WQa g;
  private final int h;
  
  static
  {
    rXa localrXa = new rXa(vXa.a(b.class), "imageFormat", "getImageFormat()I");
    vXa.a(localrXa);
    a = new XXa[] { localrXa };
  }
  
  public Aja$b()
  {
    Object localObject1 = EVa.a(Executors.newSingleThreadExecutor());
    oXa.a(localObject1, "from(Executors.newSingleThreadExecutor())");
    this.g = ((WQa)localObject1);
    this.h = 500;
    int j = (int)Math.ceil(localAja.o() * localAja.k() * ImageFormat.getBitsPerPixel(d()) / 8.0D);
    int k = 0;
    while (k <= 0)
    {
      localObject1 = ByteBuffer.wrap(new byte[j * 2 + 1]);
      Map localMap = this.b;
      Object localObject2 = ((ByteBuffer)localObject1).array();
      oXa.a(localObject2, "bb.array()");
      oXa.a(localObject1, "bb");
      localMap.put(localObject2, localObject1);
      localObject2 = localAja.b();
      if (localObject2 != null)
      {
        ((Camera)localObject2).addCallbackBuffer(((ByteBuffer)localObject1).array());
        k++;
      }
      else
      {
        oXa.a();
        throw null;
      }
    }
  }
  
  private final int d()
  {
    QVa localQVa = this.f;
    XXa localXXa = a[0];
    return ((Number)localQVa.getValue()).intValue();
  }
  
  public void a()
  {
    b();
  }
  
  public void a(WVa<byte[], ? extends Camera> paramWVa)
  {
    oXa.b(paramWVa, "pair");
    Object localObject1 = (byte[])paramWVa.c();
    paramWVa = (Camera)paramWVa.d();
    Object localObject2 = new b.a();
    ArrayList localArrayList;
    try
    {
      ((b.a)localObject2).a((ByteBuffer)this.b.get(localObject1), this.i.o(), this.i.k(), d());
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      localArrayList = this.c;
      localObject3 = this.b.get(localObject1);
      if (localObject3 == null) {
        break label353;
      }
    }
    localArrayList.add(localObject3);
    int j = this.i.l();
    Object localObject3 = new Camera.CameraInfo();
    Camera.getCameraInfo(this.i.c(), (Camera.CameraInfo)localObject3);
    if (((Camera.CameraInfo)localObject3).facing == 1) {
      j = 360 - this.i.l();
    }
    j %= 360;
    if (j != 0)
    {
      if (j != 90)
      {
        if (j != 180)
        {
          if (j == 270) {
            ((b.a)localObject2).a(3);
          }
        }
        else {
          ((b.a)localObject2).a(2);
        }
      }
      else {
        ((b.a)localObject2).a(1);
      }
    }
    else {
      ((b.a)localObject2).a(0);
    }
    long l1 = this.e;
    ((b.a)localObject2).a(SystemClock.elapsedRealtime() - this.d);
    localObject2 = ((b.a)localObject2).a();
    Aja.c(this.i).b((b)localObject2);
    this.e = (SystemClock.elapsedRealtime() - this.d);
    long l2 = this.e;
    j = this.h;
    if (l2 - l1 < j) {
      Thread.sleep(j - (l2 - l1));
    }
    localObject1 = this.b.get(localObject1);
    if (localObject1 != null)
    {
      paramWVa.addCallbackBuffer(((ByteBuffer)localObject1).array());
      this.e = (SystemClock.elapsedRealtime() - this.d);
      return;
    }
    oXa.a();
    throw null;
    label353:
    oXa.a();
    throw null;
  }
  
  public void a(Throwable paramThrowable)
  {
    oXa.b(paramThrowable, "e");
    b();
  }
  
  public void a(kRa paramkRa)
  {
    oXa.b(paramkRa, "d");
  }
  
  public final void b() {}
  
  public final WQa c()
  {
    return this.g;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Aja$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */