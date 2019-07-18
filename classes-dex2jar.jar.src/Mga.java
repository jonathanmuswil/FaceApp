final class mga<T>
  implements ARa<uia>
{
  mga(jga paramjga, uXa paramuXa) {}
  
  public final void a(uia paramuia)
  {
    if (paramuia.d())
    {
      jga localjga = this.a;
      paramuia = paramuia.a();
      Object localObject1 = this.b.a;
      if (localObject1 != null)
      {
        localObject1 = ((oga.a)localObject1).a();
        Object localObject2 = this.b.a;
        if (localObject2 != null)
        {
          localObject2 = ((oga.a)localObject2).e();
          Object localObject3 = this.b.a;
          if (localObject3 != null)
          {
            String str = ((oga.a)localObject3).b();
            localObject3 = this.b.a;
            if (localObject3 != null)
            {
              localjga.b(new jga.b(paramuia, (String)localObject1, (String)localObject2, str, ((oga.a)localObject3).c()));
            }
            else
            {
              oXa.b("apiResponse");
              throw null;
            }
          }
          else
          {
            oXa.b("apiResponse");
            throw null;
          }
        }
        else
        {
          oXa.b("apiResponse");
          throw null;
        }
      }
      else
      {
        oXa.b("apiResponse");
        throw null;
      }
    }
    else
    {
      this.a.a(new tia(paramuia.b(), paramuia.c()));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */