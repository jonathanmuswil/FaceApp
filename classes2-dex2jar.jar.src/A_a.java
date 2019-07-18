import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

final class a_a
{
  private final TYa a;
  private final ZZa b;
  private final YYa c;
  private final lZa d;
  private List<Proxy> e = Collections.emptyList();
  private int f;
  private List<InetSocketAddress> g = Collections.emptyList();
  private final List<EZa> h = new ArrayList();
  
  a_a(TYa paramTYa, ZZa paramZZa, YYa paramYYa, lZa paramlZa)
  {
    this.a = paramTYa;
    this.b = paramZZa;
    this.c = paramYYa;
    this.d = paramlZa;
    a(paramTYa.k(), paramTYa.f());
  }
  
  static String a(InetSocketAddress paramInetSocketAddress)
  {
    InetAddress localInetAddress = paramInetSocketAddress.getAddress();
    if (localInetAddress == null) {
      return paramInetSocketAddress.getHostName();
    }
    return localInetAddress.getHostAddress();
  }
  
  private void a(Proxy paramProxy)
    throws IOException
  {
    this.g = new ArrayList();
    Object localObject;
    int i;
    if ((paramProxy.type() != Proxy.Type.DIRECT) && (paramProxy.type() != Proxy.Type.SOCKS))
    {
      localObject = paramProxy.address();
      if ((localObject instanceof InetSocketAddress))
      {
        InetSocketAddress localInetSocketAddress = (InetSocketAddress)localObject;
        localObject = a(localInetSocketAddress);
        i = localInetSocketAddress.getPort();
      }
      else
      {
        paramProxy = new StringBuilder();
        paramProxy.append("Proxy.address() is not an InetSocketAddress: ");
        paramProxy.append(localObject.getClass());
        throw new IllegalArgumentException(paramProxy.toString());
      }
    }
    else
    {
      localObject = this.a.k().g();
      i = this.a.k().k();
    }
    if ((i >= 1) && (i <= 65535))
    {
      if (paramProxy.type() == Proxy.Type.SOCKS)
      {
        this.g.add(InetSocketAddress.createUnresolved((String)localObject, i));
      }
      else
      {
        this.d.a(this.c, (String)localObject);
        paramProxy = this.a.c().lookup((String)localObject);
        if (paramProxy.isEmpty()) {
          break label271;
        }
        this.d.a(this.c, (String)localObject, paramProxy);
        int j = 0;
        int k = paramProxy.size();
        while (j < k)
        {
          localObject = (InetAddress)paramProxy.get(j);
          this.g.add(new InetSocketAddress((InetAddress)localObject, i));
          j++;
        }
      }
      return;
      label271:
      paramProxy = new StringBuilder();
      paramProxy.append(this.a.c());
      paramProxy.append(" returned no addresses for ");
      paramProxy.append((String)localObject);
      throw new UnknownHostException(paramProxy.toString());
    }
    paramProxy = new StringBuilder();
    paramProxy.append("No route to ");
    paramProxy.append((String)localObject);
    paramProxy.append(":");
    paramProxy.append(i);
    paramProxy.append("; port is out of range");
    throw new SocketException(paramProxy.toString());
  }
  
  private void a(pZa parampZa, Proxy paramProxy)
  {
    if (paramProxy != null)
    {
      this.e = Collections.singletonList(paramProxy);
    }
    else
    {
      parampZa = this.a.h().select(parampZa.o());
      if ((parampZa != null) && (!parampZa.isEmpty())) {
        parampZa = LZa.a(parampZa);
      } else {
        parampZa = LZa.a(new Proxy[] { Proxy.NO_PROXY });
      }
      this.e = parampZa;
    }
    this.f = 0;
  }
  
  private boolean c()
  {
    boolean bool;
    if (this.f < this.e.size()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private Proxy d()
    throws IOException
  {
    if (c())
    {
      localObject = this.e;
      int i = this.f;
      this.f = (i + 1);
      localObject = (Proxy)((List)localObject).get(i);
      a((Proxy)localObject);
      return (Proxy)localObject;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No route to ");
    ((StringBuilder)localObject).append(this.a.k().g());
    ((StringBuilder)localObject).append("; exhausted proxy configurations: ");
    ((StringBuilder)localObject).append(this.e);
    throw new SocketException(((StringBuilder)localObject).toString());
  }
  
  public boolean a()
  {
    boolean bool;
    if ((!c()) && (this.h.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public a_a.a b()
    throws IOException
  {
    if (a())
    {
      ArrayList localArrayList = new ArrayList();
      do
      {
        if (!c()) {
          break;
        }
        Proxy localProxy = d();
        int i = 0;
        int j = this.g.size();
        while (i < j)
        {
          EZa localEZa = new EZa(this.a, localProxy, (InetSocketAddress)this.g.get(i));
          if (this.b.c(localEZa)) {
            this.h.add(localEZa);
          } else {
            localArrayList.add(localEZa);
          }
          i++;
        }
      } while (localArrayList.isEmpty());
      if (localArrayList.isEmpty())
      {
        localArrayList.addAll(this.h);
        this.h.clear();
      }
      return new a_a.a(localArrayList);
    }
    throw new NoSuchElementException();
  }
  
  public static final class a
  {
    private final List<EZa> a;
    private int b = 0;
    
    a(List<EZa> paramList)
    {
      this.a = paramList;
    }
    
    public List<EZa> a()
    {
      return new ArrayList(this.a);
    }
    
    public boolean b()
    {
      boolean bool;
      if (this.b < this.a.size()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public EZa c()
    {
      if (b())
      {
        List localList = this.a;
        int i = this.b;
        this.b = (i + 1);
        return (EZa)localList.get(i);
      }
      throw new NoSuchElementException();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/a_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */