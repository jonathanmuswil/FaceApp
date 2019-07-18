import java.util.HashMap;
import java.util.List;
import java.util.Map;

class eh$a
{
  private final Map<Class<?>, eh.a.a<?>> a = new HashMap();
  
  public <Model> List<ch<Model, ?>> a(Class<Model> paramClass)
  {
    paramClass = (eh.a.a)this.a.get(paramClass);
    if (paramClass == null) {
      paramClass = null;
    } else {
      paramClass = paramClass.a;
    }
    return paramClass;
  }
  
  public void a()
  {
    this.a.clear();
  }
  
  public <Model> void a(Class<Model> paramClass, List<ch<Model, ?>> paramList)
  {
    if ((eh.a.a)this.a.put(paramClass, new eh.a.a(paramList)) == null) {
      return;
    }
    paramList = new StringBuilder();
    paramList.append("Already cached loaders for model: ");
    paramList.append(paramClass);
    throw new IllegalStateException(paramList.toString());
  }
  
  private static class a<Model>
  {
    final List<ch<Model, ?>> a;
    
    public a(List<ch<Model, ?>> paramList)
    {
      this.a = paramList;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/eh$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */