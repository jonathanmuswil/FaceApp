import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class uZa$a
{
  int A;
  int B;
  hZa a = new hZa();
  Proxy b;
  List<vZa> c = uZa.a;
  List<dZa> d = uZa.b;
  final List<qZa> e = new ArrayList();
  final List<qZa> f = new ArrayList();
  lZa.a g = lZa.a(lZa.a);
  ProxySelector h = ProxySelector.getDefault();
  gZa i;
  WYa j;
  RZa k;
  SocketFactory l;
  SSLSocketFactory m;
  Y_a n;
  HostnameVerifier o;
  _Ya p;
  VYa q;
  VYa r;
  cZa s;
  jZa t;
  boolean u;
  boolean v;
  boolean w;
  int x;
  int y;
  int z;
  
  public uZa$a()
  {
    if (this.h == null) {
      this.h = new V_a();
    }
    this.i = gZa.a;
    this.l = SocketFactory.getDefault();
    this.o = Z_a.a;
    this.p = _Ya.a;
    VYa localVYa = VYa.a;
    this.q = localVYa;
    this.r = localVYa;
    this.s = new cZa();
    this.t = jZa.a;
    this.u = true;
    this.v = true;
    this.w = true;
    this.x = 0;
    this.y = 10000;
    this.z = 10000;
    this.A = 10000;
    this.B = 0;
  }
  
  public a a(long paramLong, TimeUnit paramTimeUnit)
  {
    this.y = LZa.a("timeout", paramLong, paramTimeUnit);
    return this;
  }
  
  public a a(qZa paramqZa)
  {
    if (paramqZa != null)
    {
      this.e.add(paramqZa);
      return this;
    }
    throw new IllegalArgumentException("interceptor == null");
  }
  
  public uZa a()
  {
    return new uZa(this);
  }
  
  public a b(long paramLong, TimeUnit paramTimeUnit)
  {
    this.z = LZa.a("timeout", paramLong, paramTimeUnit);
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/uZa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */