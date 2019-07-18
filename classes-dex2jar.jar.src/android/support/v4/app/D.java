package android.support.v4.app;

import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import ld;

final class d
  extends G
  implements s.a, z.h
{
  final z a;
  ArrayList<a> b = new ArrayList();
  int c;
  int d;
  int e;
  int f;
  int g;
  int h;
  boolean i;
  boolean j = true;
  String k;
  boolean l;
  int m = -1;
  int n;
  CharSequence o;
  int p;
  CharSequence q;
  ArrayList<String> r;
  ArrayList<String> s;
  boolean t = false;
  ArrayList<Runnable> u;
  
  public d(z paramz)
  {
    this.a = paramz;
  }
  
  private void a(int paramInt1, l paraml, String paramString, int paramInt2)
  {
    Object localObject = paraml.getClass();
    int i1 = ((Class)localObject).getModifiers();
    if ((!((Class)localObject).isAnonymousClass()) && (Modifier.isPublic(i1)) && ((!((Class)localObject).isMemberClass()) || (Modifier.isStatic(i1))))
    {
      paraml.t = this.a;
      if (paramString != null)
      {
        localObject = paraml.B;
        if ((localObject != null) && (!paramString.equals(localObject)))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Can't change tag of fragment ");
          ((StringBuilder)localObject).append(paraml);
          ((StringBuilder)localObject).append(": was ");
          ((StringBuilder)localObject).append(paraml.B);
          ((StringBuilder)localObject).append(" now ");
          ((StringBuilder)localObject).append(paramString);
          throw new IllegalStateException(((StringBuilder)localObject).toString());
        }
        paraml.B = paramString;
      }
      if (paramInt1 != 0) {
        if (paramInt1 != -1)
        {
          i1 = paraml.z;
          if ((i1 != 0) && (i1 != paramInt1))
          {
            paramString = new StringBuilder();
            paramString.append("Can't change container ID of fragment ");
            paramString.append(paraml);
            paramString.append(": was ");
            paramString.append(paraml.z);
            paramString.append(" now ");
            paramString.append(paramInt1);
            throw new IllegalStateException(paramString.toString());
          }
          paraml.z = paramInt1;
          paraml.A = paramInt1;
        }
        else
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Can't add fragment ");
          ((StringBuilder)localObject).append(paraml);
          ((StringBuilder)localObject).append(" with tag ");
          ((StringBuilder)localObject).append(paramString);
          ((StringBuilder)localObject).append(" to container view with no id");
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      a(new a(paramInt2, paraml));
      return;
    }
    paraml = new StringBuilder();
    paraml.append("Fragment ");
    paraml.append(((Class)localObject).getCanonicalName());
    paraml.append(" must be a public static class to be  properly recreated from");
    paraml.append(" instance state.");
    throw new IllegalStateException(paraml.toString());
  }
  
  private static boolean b(a parama)
  {
    parama = parama.b;
    boolean bool;
    if ((parama != null) && (parama.m) && (parama.K != null) && (!parama.D) && (!parama.C) && (parama.lb())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int a()
  {
    return b(false);
  }
  
  public G a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
    return this;
  }
  
  public G a(int paramInt, l paraml)
  {
    a(paramInt, paraml, null, 1);
    return this;
  }
  
  public G a(int paramInt, l paraml, String paramString)
  {
    a(paramInt, paraml, paramString, 1);
    return this;
  }
  
  public G a(l paraml)
  {
    a(new a(3, paraml));
    return this;
  }
  
  public G a(l paraml, String paramString)
  {
    a(0, paraml, paramString, 1);
    return this;
  }
  
  public G a(String paramString)
  {
    if (this.j)
    {
      this.i = true;
      this.k = paramString;
      return this;
    }
    throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
  }
  
  public G a(boolean paramBoolean)
  {
    this.t = paramBoolean;
    return this;
  }
  
  l a(ArrayList<l> paramArrayList, l paraml)
  {
    int i1 = 0;
    for (l locall1 = paraml; i1 < this.b.size(); locall1 = paraml)
    {
      Object localObject = (a)this.b.get(i1);
      int i2 = ((a)localObject).a;
      if (i2 != 1) {
        if (i2 != 2)
        {
          if ((i2 != 3) && (i2 != 6))
          {
            if (i2 != 7)
            {
              if (i2 != 8)
              {
                i2 = i1;
                paraml = locall1;
                break label443;
              }
              this.b.add(i1, new a(9, locall1));
              i2 = i1 + 1;
              paraml = ((a)localObject).b;
              break label443;
            }
          }
          else
          {
            paramArrayList.remove(((a)localObject).b);
            localObject = ((a)localObject).b;
            i2 = i1;
            paraml = locall1;
            if (localObject != locall1) {
              break label443;
            }
            this.b.add(i1, new a(9, (l)localObject));
            i2 = i1 + 1;
            paraml = null;
            break label443;
          }
        }
        else
        {
          l locall2 = ((a)localObject).b;
          int i3 = locall2.A;
          i2 = paramArrayList.size() - 1;
          paraml = locall1;
          int i4 = 0;
          while (i2 >= 0)
          {
            l locall3 = (l)paramArrayList.get(i2);
            int i5 = i4;
            int i6 = i1;
            locall1 = paraml;
            if (locall3.A == i3) {
              if (locall3 == locall2)
              {
                i5 = 1;
                i6 = i1;
                locall1 = paraml;
              }
              else
              {
                i5 = i1;
                locall1 = paraml;
                if (locall3 == paraml)
                {
                  this.b.add(i1, new a(9, locall3));
                  i5 = i1 + 1;
                  locall1 = null;
                }
                paraml = new a(3, locall3);
                paraml.c = ((a)localObject).c;
                paraml.e = ((a)localObject).e;
                paraml.d = ((a)localObject).d;
                paraml.f = ((a)localObject).f;
                this.b.add(i5, paraml);
                paramArrayList.remove(locall3);
                i6 = i5 + 1;
                i5 = i4;
              }
            }
            i2--;
            i4 = i5;
            i1 = i6;
            paraml = locall1;
          }
          if (i4 != 0)
          {
            this.b.remove(i1);
            i1--;
          }
          else
          {
            ((a)localObject).a = 1;
            paramArrayList.add(locall2);
          }
          i2 = i1;
          break label443;
        }
      }
      paramArrayList.add(((a)localObject).b);
      paraml = locall1;
      i2 = i1;
      label443:
      i1 = i2 + 1;
    }
    return locall1;
  }
  
  void a(int paramInt)
  {
    if (!this.i) {
      return;
    }
    Object localObject1;
    if (z.a)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Bump nesting in ");
      ((StringBuilder)localObject1).append(this);
      ((StringBuilder)localObject1).append(" by ");
      ((StringBuilder)localObject1).append(paramInt);
      Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    int i1 = this.b.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      localObject1 = (a)this.b.get(i2);
      Object localObject2 = ((a)localObject1).b;
      if (localObject2 != null)
      {
        ((l)localObject2).s += paramInt;
        if (z.a)
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Bump nesting of ");
          ((StringBuilder)localObject2).append(((a)localObject1).b);
          ((StringBuilder)localObject2).append(" to ");
          ((StringBuilder)localObject2).append(((a)localObject1).b.s);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
      }
    }
  }
  
  void a(a parama)
  {
    this.b.add(parama);
    parama.c = this.c;
    parama.d = this.d;
    parama.e = this.e;
    parama.f = this.f;
  }
  
  void a(l.c paramc)
  {
    for (int i1 = 0; i1 < this.b.size(); i1++)
    {
      a locala = (a)this.b.get(i1);
      if (b(locala)) {
        locala.b.a(paramc);
      }
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    a(paramString, paramPrintWriter, true);
  }
  
  public void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.k);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.m);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.l);
      if (this.g != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.g));
        paramPrintWriter.print(" mTransitionStyle=#");
        paramPrintWriter.println(Integer.toHexString(this.h));
      }
      if ((this.c != 0) || (this.d != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.c));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.d));
      }
      if ((this.e != 0) || (this.f != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.e));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.f));
      }
      if ((this.n != 0) || (this.o != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.n));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.o);
      }
      if ((this.p != 0) || (this.q != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.p));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.q);
      }
    }
    if (!this.b.isEmpty())
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("    ");
      ((StringBuilder)localObject).toString();
      int i1 = this.b.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        a locala = (a)this.b.get(i2);
        switch (locala.a)
        {
        default: 
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("cmd=");
          ((StringBuilder)localObject).append(locala.a);
          localObject = ((StringBuilder)localObject).toString();
          break;
        case 9: 
          localObject = "UNSET_PRIMARY_NAV";
          break;
        case 8: 
          localObject = "SET_PRIMARY_NAV";
          break;
        case 7: 
          localObject = "ATTACH";
          break;
        case 6: 
          localObject = "DETACH";
          break;
        case 5: 
          localObject = "SHOW";
          break;
        case 4: 
          localObject = "HIDE";
          break;
        case 3: 
          localObject = "REMOVE";
          break;
        case 2: 
          localObject = "REPLACE";
          break;
        case 1: 
          localObject = "ADD";
          break;
        case 0: 
          localObject = "NULL";
        }
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  Op #");
        paramPrintWriter.print(i2);
        paramPrintWriter.print(": ");
        paramPrintWriter.print((String)localObject);
        paramPrintWriter.print(" ");
        paramPrintWriter.println(locala.b);
        if (paramBoolean)
        {
          if ((locala.c != 0) || (locala.d != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(locala.c));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(locala.d));
          }
          if ((locala.e != 0) || (locala.f != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(locala.e));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(locala.f));
          }
        }
      }
    }
  }
  
  boolean a(ArrayList<d> paramArrayList, int paramInt1, int paramInt2)
  {
    if (paramInt2 == paramInt1) {
      return false;
    }
    int i1 = this.b.size();
    int i2 = 0;
    int i5;
    for (int i3 = -1; i2 < i1; i3 = i5)
    {
      l locall = ((a)this.b.get(i2)).b;
      int i4;
      if (locall != null) {
        i4 = locall.A;
      } else {
        i4 = 0;
      }
      i5 = i3;
      if (i4 != 0)
      {
        i5 = i3;
        if (i4 != i3)
        {
          for (i3 = paramInt1; i3 < paramInt2; i3++)
          {
            d locald = (d)paramArrayList.get(i3);
            int i6 = locald.b.size();
            for (i5 = 0; i5 < i6; i5++)
            {
              locall = ((a)locald.b.get(i5)).b;
              int i7;
              if (locall != null) {
                i7 = locall.A;
              } else {
                i7 = 0;
              }
              if (i7 == i4) {
                return true;
              }
            }
          }
          i5 = i4;
        }
      }
      i2++;
    }
    return false;
  }
  
  public boolean a(ArrayList<d> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    if (z.a)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Run: ");
      localStringBuilder.append(this);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    paramArrayList.add(this);
    paramArrayList1.add(Boolean.valueOf(false));
    if (this.i) {
      this.a.a(this);
    }
    return true;
  }
  
  public int b()
  {
    return b(true);
  }
  
  int b(boolean paramBoolean)
  {
    if (!this.l)
    {
      if (z.a)
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Commit: ");
        ((StringBuilder)localObject).append(this);
        Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        localObject = new PrintWriter(new ld("FragmentManager"));
        a("  ", null, (PrintWriter)localObject, null);
        ((PrintWriter)localObject).close();
      }
      this.l = true;
      if (this.i) {
        this.m = this.a.b(this);
      } else {
        this.m = -1;
      }
      this.a.a(this, paramBoolean);
      return this.m;
    }
    throw new IllegalStateException("commit already called");
  }
  
  public G b(int paramInt, l paraml)
  {
    b(paramInt, paraml, null);
    return this;
  }
  
  public G b(int paramInt, l paraml, String paramString)
  {
    if (paramInt != 0)
    {
      a(paramInt, paraml, paramString, 2);
      return this;
    }
    throw new IllegalArgumentException("Must use non-zero containerViewId");
  }
  
  l b(ArrayList<l> paramArrayList, l paraml)
  {
    for (int i1 = 0; i1 < this.b.size(); i1++)
    {
      a locala = (a)this.b.get(i1);
      int i2 = locala.a;
      if (i2 != 1)
      {
        if (i2 != 3) {}
        switch (i2)
        {
        default: 
          break;
        case 9: 
          paraml = locala.b;
          break;
        case 8: 
          paraml = null;
          break;
        case 6: 
          paramArrayList.add(locala.b);
          break;
        }
      }
      else
      {
        paramArrayList.remove(locala.b);
      }
    }
    return paraml;
  }
  
  boolean b(int paramInt)
  {
    int i1 = this.b.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      l locall = ((a)this.b.get(i2)).b;
      int i3;
      if (locall != null) {
        i3 = locall.A;
      } else {
        i3 = 0;
      }
      if ((i3 != 0) && (i3 == paramInt)) {
        return true;
      }
    }
    return false;
  }
  
  public void c()
  {
    e();
    this.a.b(this, false);
  }
  
  void c(boolean paramBoolean)
  {
    Object localObject1;
    for (int i1 = this.b.size() - 1; i1 >= 0; i1--)
    {
      localObject1 = (a)this.b.get(i1);
      Object localObject2 = ((a)localObject1).b;
      if (localObject2 != null) {
        ((l)localObject2).a(z.e(this.g), this.h);
      }
      switch (((a)localObject1).a)
      {
      case 2: 
      default: 
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Unknown cmd: ");
        ((StringBuilder)localObject2).append(((a)localObject1).a);
        throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
      case 9: 
        this.a.o((l)localObject2);
        break;
      case 8: 
        this.a.o(null);
        break;
      case 7: 
        ((l)localObject2).c(((a)localObject1).f);
        this.a.d((l)localObject2);
        break;
      case 6: 
        ((l)localObject2).c(((a)localObject1).e);
        this.a.b((l)localObject2);
        break;
      case 5: 
        ((l)localObject2).c(((a)localObject1).f);
        this.a.f((l)localObject2);
        break;
      case 4: 
        ((l)localObject2).c(((a)localObject1).e);
        this.a.p((l)localObject2);
        break;
      case 3: 
        ((l)localObject2).c(((a)localObject1).e);
        this.a.a((l)localObject2, false);
        break;
      case 1: 
        ((l)localObject2).c(((a)localObject1).f);
        this.a.l((l)localObject2);
      }
      if ((!this.t) && (((a)localObject1).a != 3) && (localObject2 != null)) {
        this.a.i((l)localObject2);
      }
    }
    if ((!this.t) && (paramBoolean))
    {
      localObject1 = this.a;
      ((z)localObject1).a(((z)localObject1).r, true);
    }
  }
  
  public void d()
  {
    e();
    this.a.b(this, true);
  }
  
  public G e()
  {
    if (!this.i)
    {
      this.j = false;
      return this;
    }
    throw new IllegalStateException("This transaction is already being added to the back stack");
  }
  
  void f()
  {
    int i1 = this.b.size();
    Object localObject1;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localObject1 = (a)this.b.get(i2);
      Object localObject2 = ((a)localObject1).b;
      if (localObject2 != null) {
        ((l)localObject2).a(this.g, this.h);
      }
      switch (((a)localObject1).a)
      {
      case 2: 
      default: 
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Unknown cmd: ");
        ((StringBuilder)localObject2).append(((a)localObject1).a);
        throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
      case 9: 
        this.a.o(null);
        break;
      case 8: 
        this.a.o((l)localObject2);
        break;
      case 7: 
        ((l)localObject2).c(((a)localObject1).c);
        this.a.b((l)localObject2);
        break;
      case 6: 
        ((l)localObject2).c(((a)localObject1).d);
        this.a.d((l)localObject2);
        break;
      case 5: 
        ((l)localObject2).c(((a)localObject1).c);
        this.a.p((l)localObject2);
        break;
      case 4: 
        ((l)localObject2).c(((a)localObject1).d);
        this.a.f((l)localObject2);
        break;
      case 3: 
        ((l)localObject2).c(((a)localObject1).d);
        this.a.l((l)localObject2);
        break;
      case 1: 
        ((l)localObject2).c(((a)localObject1).c);
        this.a.a((l)localObject2, false);
      }
      if ((!this.t) && (((a)localObject1).a != 1) && (localObject2 != null)) {
        this.a.i((l)localObject2);
      }
    }
    if (!this.t)
    {
      localObject1 = this.a;
      ((z)localObject1).a(((z)localObject1).r, true);
    }
  }
  
  boolean g()
  {
    for (int i1 = 0; i1 < this.b.size(); i1++) {
      if (b((a)this.b.get(i1))) {
        return true;
      }
    }
    return false;
  }
  
  public String getName()
  {
    return this.k;
  }
  
  public void h()
  {
    ArrayList localArrayList = this.u;
    if (localArrayList != null)
    {
      int i1 = 0;
      int i2 = localArrayList.size();
      while (i1 < i2)
      {
        ((Runnable)this.u.get(i1)).run();
        i1++;
      }
      this.u = null;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.m >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.m);
    }
    if (this.k != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.k);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  static final class a
  {
    int a;
    l b;
    int c;
    int d;
    int e;
    int f;
    
    a() {}
    
    a(int paramInt, l paraml)
    {
      this.a = paramInt;
      this.b = paraml;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */