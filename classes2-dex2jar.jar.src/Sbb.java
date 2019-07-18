import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class sbb
{
  private final Method a;
  private final pZa b;
  final String c;
  private final String d;
  private final oZa e;
  private final rZa f;
  private final boolean g;
  private final boolean h;
  private final boolean i;
  private final pbb<?>[] j;
  
  sbb(sbb.a parama)
  {
    this.a = parama.d;
    this.b = parama.c.c;
    this.c = parama.p;
    this.d = parama.t;
    this.e = parama.u;
    this.f = parama.v;
    this.g = parama.q;
    this.h = parama.r;
    this.i = parama.s;
    this.j = parama.x;
  }
  
  static sbb a(vbb paramvbb, Method paramMethod)
  {
    return new sbb.a(paramvbb, paramMethod).a();
  }
  
  xZa a(Object[] paramArrayOfObject)
    throws IOException
  {
    pbb[] arrayOfpbb = this.j;
    int k = paramArrayOfObject.length;
    if (k == arrayOfpbb.length)
    {
      rbb localrbb = new rbb(this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i);
      ArrayList localArrayList = new ArrayList(k);
      for (int m = 0; m < k; m++)
      {
        localArrayList.add(paramArrayOfObject[m]);
        arrayOfpbb[m].a(localrbb, paramArrayOfObject[m]);
      }
      paramArrayOfObject = localrbb.a();
      paramArrayOfObject.a(ibb.class, new ibb(this.a, localArrayList));
      return paramArrayOfObject.a();
    }
    paramArrayOfObject = new StringBuilder();
    paramArrayOfObject.append("Argument count (");
    paramArrayOfObject.append(k);
    paramArrayOfObject.append(") doesn't match expected count (");
    paramArrayOfObject.append(arrayOfpbb.length);
    paramArrayOfObject.append(")");
    throw new IllegalArgumentException(paramArrayOfObject.toString());
  }
  
  static final class a
  {
    private static final Pattern a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    private static final Pattern b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    final vbb c;
    final Method d;
    final Annotation[] e;
    final Annotation[][] f;
    final Type[] g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    String p;
    boolean q;
    boolean r;
    boolean s;
    String t;
    oZa u;
    rZa v;
    Set<String> w;
    pbb<?>[] x;
    
    a(vbb paramvbb, Method paramMethod)
    {
      this.c = paramvbb;
      this.d = paramMethod;
      this.e = paramMethod.getAnnotations();
      this.g = paramMethod.getGenericParameterTypes();
      this.f = paramMethod.getParameterAnnotations();
    }
    
    private static Class<?> a(Class<?> paramClass)
    {
      if (Boolean.TYPE == paramClass) {
        return Boolean.class;
      }
      if (Byte.TYPE == paramClass) {
        return Byte.class;
      }
      if (Character.TYPE == paramClass) {
        return Character.class;
      }
      if (Double.TYPE == paramClass) {
        return Double.class;
      }
      if (Float.TYPE == paramClass) {
        return Float.class;
      }
      if (Integer.TYPE == paramClass) {
        return Integer.class;
      }
      if (Long.TYPE == paramClass) {
        return Long.class;
      }
      Object localObject = paramClass;
      if (Short.TYPE == paramClass) {
        localObject = Short.class;
      }
      return (Class<?>)localObject;
    }
    
    static Set<String> a(String paramString)
    {
      Matcher localMatcher = a.matcher(paramString);
      paramString = new LinkedHashSet();
      while (localMatcher.find()) {
        paramString.add(localMatcher.group(1));
      }
      return paramString;
    }
    
    private oZa a(String[] paramArrayOfString)
    {
      oZa.a locala = new oZa.a();
      int i1 = paramArrayOfString.length;
      int i2 = 0;
      while (i2 < i1)
      {
        String str1 = paramArrayOfString[i2];
        int i3 = str1.indexOf(':');
        if ((i3 != -1) && (i3 != 0) && (i3 != str1.length() - 1))
        {
          String str2 = str1.substring(0, i3);
          str1 = str1.substring(i3 + 1).trim();
          if ("Content-Type".equalsIgnoreCase(str2)) {
            try
            {
              this.v = rZa.a(str1);
            }
            catch (IllegalArgumentException paramArrayOfString)
            {
              throw xbb.a(this.d, paramArrayOfString, "Malformed content type: %s", new Object[] { str1 });
            }
          } else {
            locala.a(str2, str1);
          }
          i2++;
        }
        else
        {
          throw xbb.a(this.d, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", new Object[] { str1 });
        }
      }
      return locala.a();
    }
    
    private pbb<?> a(int paramInt, Type paramType, Annotation[] paramArrayOfAnnotation)
    {
      Object localObject = null;
      if (paramArrayOfAnnotation != null)
      {
        int i1 = paramArrayOfAnnotation.length;
        localObject = null;
        int i2 = 0;
        while (i2 < i1)
        {
          pbb localpbb = a(paramInt, paramType, paramArrayOfAnnotation, paramArrayOfAnnotation[i2]);
          if (localpbb != null)
          {
            if (localObject == null) {
              localObject = localpbb;
            }
          }
          else
          {
            i2++;
            continue;
          }
          throw xbb.a(this.d, paramInt, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
        }
      }
      if (localObject != null) {
        return (pbb<?>)localObject;
      }
      throw xbb.a(this.d, paramInt, "No Retrofit annotation found.", new Object[0]);
    }
    
    private pbb<?> a(int paramInt, Type paramType, Annotation[] paramArrayOfAnnotation, Annotation paramAnnotation)
    {
      if ((paramAnnotation instanceof gcb))
      {
        a(paramInt, paramType);
        if (!this.o)
        {
          if (!this.k)
          {
            if (!this.l)
            {
              if (!this.m)
              {
                if (!this.n)
                {
                  if (this.t == null)
                  {
                    this.o = true;
                    if ((paramType != pZa.class) && (paramType != String.class) && (paramType != URI.class) && ((!(paramType instanceof Class)) || (!"android.net.Uri".equals(((Class)paramType).getName())))) {
                      throw xbb.a(this.d, paramInt, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                    }
                    return new pbb.l();
                  }
                  throw xbb.a(this.d, paramInt, "@Url cannot be used with @%s URL", new Object[] { this.p });
                }
                throw xbb.a(this.d, paramInt, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
              }
              throw xbb.a(this.d, paramInt, "A @Url parameter must not come after a @QueryName.", new Object[0]);
            }
            throw xbb.a(this.d, paramInt, "A @Url parameter must not come after a @Query.", new Object[0]);
          }
          throw xbb.a(this.d, paramInt, "@Path parameters may not be used with @Url.", new Object[0]);
        }
        throw xbb.a(this.d, paramInt, "Multiple @Url method annotations found.", new Object[0]);
      }
      Object localObject;
      if ((paramAnnotation instanceof bcb))
      {
        a(paramInt, paramType);
        if (!this.l)
        {
          if (!this.m)
          {
            if (!this.n)
            {
              if (!this.o)
              {
                if (this.t != null)
                {
                  this.k = true;
                  localObject = (bcb)paramAnnotation;
                  paramAnnotation = ((bcb)localObject).value();
                  a(paramInt, paramAnnotation);
                  return new pbb.g(paramAnnotation, this.c.c(paramType, paramArrayOfAnnotation), ((bcb)localObject).encoded());
                }
                throw xbb.a(this.d, paramInt, "@Path can only be used with relative url on @%s", new Object[] { this.p });
              }
              throw xbb.a(this.d, paramInt, "@Path parameters may not be used with @Url.", new Object[0]);
            }
            throw xbb.a(this.d, paramInt, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
          }
          throw xbb.a(this.d, paramInt, "A @Path parameter must not come after a @QueryName.", new Object[0]);
        }
        throw xbb.a(this.d, paramInt, "A @Path parameter must not come after a @Query.", new Object[0]);
      }
      boolean bool;
      if ((paramAnnotation instanceof ccb))
      {
        a(paramInt, paramType);
        localObject = (ccb)paramAnnotation;
        paramAnnotation = ((ccb)localObject).value();
        bool = ((ccb)localObject).encoded();
        localObject = xbb.c(paramType);
        this.l = true;
        if (Iterable.class.isAssignableFrom((Class)localObject))
        {
          if ((paramType instanceof ParameterizedType))
          {
            paramType = xbb.a(0, (ParameterizedType)paramType);
            return new pbb.h(paramAnnotation, this.c.c(paramType, paramArrayOfAnnotation), bool).b();
          }
          paramType = this.d;
          paramArrayOfAnnotation = new StringBuilder();
          paramArrayOfAnnotation.append(((Class)localObject).getSimpleName());
          paramArrayOfAnnotation.append(" must include generic type (e.g., ");
          paramArrayOfAnnotation.append(((Class)localObject).getSimpleName());
          paramArrayOfAnnotation.append("<String>)");
          throw xbb.a(paramType, paramInt, paramArrayOfAnnotation.toString(), new Object[0]);
        }
        if (((Class)localObject).isArray())
        {
          paramType = a(((Class)localObject).getComponentType());
          return new pbb.h(paramAnnotation, this.c.c(paramType, paramArrayOfAnnotation), bool).a();
        }
        return new pbb.h(paramAnnotation, this.c.c(paramType, paramArrayOfAnnotation), bool);
      }
      if ((paramAnnotation instanceof ecb))
      {
        a(paramInt, paramType);
        bool = ((ecb)paramAnnotation).encoded();
        paramAnnotation = xbb.c(paramType);
        this.m = true;
        if (Iterable.class.isAssignableFrom(paramAnnotation))
        {
          if ((paramType instanceof ParameterizedType))
          {
            paramType = xbb.a(0, (ParameterizedType)paramType);
            return new pbb.j(this.c.c(paramType, paramArrayOfAnnotation), bool).b();
          }
          paramArrayOfAnnotation = this.d;
          paramType = new StringBuilder();
          paramType.append(paramAnnotation.getSimpleName());
          paramType.append(" must include generic type (e.g., ");
          paramType.append(paramAnnotation.getSimpleName());
          paramType.append("<String>)");
          throw xbb.a(paramArrayOfAnnotation, paramInt, paramType.toString(), new Object[0]);
        }
        if (paramAnnotation.isArray())
        {
          paramType = a(paramAnnotation.getComponentType());
          return new pbb.j(this.c.c(paramType, paramArrayOfAnnotation), bool).a();
        }
        return new pbb.j(this.c.c(paramType, paramArrayOfAnnotation), bool);
      }
      if ((paramAnnotation instanceof dcb))
      {
        a(paramInt, paramType);
        localObject = xbb.c(paramType);
        this.n = true;
        if (Map.class.isAssignableFrom((Class)localObject))
        {
          paramType = xbb.b(paramType, (Class)localObject, Map.class);
          if ((paramType instanceof ParameterizedType))
          {
            localObject = (ParameterizedType)paramType;
            paramType = xbb.a(0, (ParameterizedType)localObject);
            if (String.class == paramType)
            {
              paramType = xbb.a(1, (ParameterizedType)localObject);
              return new pbb.i(this.c.c(paramType, paramArrayOfAnnotation), ((dcb)paramAnnotation).encoded());
            }
            paramAnnotation = this.d;
            paramArrayOfAnnotation = new StringBuilder();
            paramArrayOfAnnotation.append("@QueryMap keys must be of type String: ");
            paramArrayOfAnnotation.append(paramType);
            throw xbb.a(paramAnnotation, paramInt, paramArrayOfAnnotation.toString(), new Object[0]);
          }
          throw xbb.a(this.d, paramInt, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
        }
        throw xbb.a(this.d, paramInt, "@QueryMap parameter type must be Map.", new Object[0]);
      }
      if ((paramAnnotation instanceof Tbb))
      {
        a(paramInt, paramType);
        localObject = ((Tbb)paramAnnotation).value();
        paramAnnotation = xbb.c(paramType);
        if (Iterable.class.isAssignableFrom(paramAnnotation))
        {
          if ((paramType instanceof ParameterizedType))
          {
            paramType = xbb.a(0, (ParameterizedType)paramType);
            return new pbb.d((String)localObject, this.c.c(paramType, paramArrayOfAnnotation)).b();
          }
          paramType = this.d;
          paramArrayOfAnnotation = new StringBuilder();
          paramArrayOfAnnotation.append(paramAnnotation.getSimpleName());
          paramArrayOfAnnotation.append(" must include generic type (e.g., ");
          paramArrayOfAnnotation.append(paramAnnotation.getSimpleName());
          paramArrayOfAnnotation.append("<String>)");
          throw xbb.a(paramType, paramInt, paramArrayOfAnnotation.toString(), new Object[0]);
        }
        if (paramAnnotation.isArray())
        {
          paramType = a(paramAnnotation.getComponentType());
          return new pbb.d((String)localObject, this.c.c(paramType, paramArrayOfAnnotation)).a();
        }
        return new pbb.d((String)localObject, this.c.c(paramType, paramArrayOfAnnotation));
      }
      if ((paramAnnotation instanceof Obb))
      {
        a(paramInt, paramType);
        if (this.r)
        {
          localObject = (Obb)paramAnnotation;
          paramAnnotation = ((Obb)localObject).value();
          bool = ((Obb)localObject).encoded();
          this.h = true;
          localObject = xbb.c(paramType);
          if (Iterable.class.isAssignableFrom((Class)localObject))
          {
            if ((paramType instanceof ParameterizedType))
            {
              paramType = xbb.a(0, (ParameterizedType)paramType);
              return new pbb.b(paramAnnotation, this.c.c(paramType, paramArrayOfAnnotation), bool).b();
            }
            paramArrayOfAnnotation = this.d;
            paramType = new StringBuilder();
            paramType.append(((Class)localObject).getSimpleName());
            paramType.append(" must include generic type (e.g., ");
            paramType.append(((Class)localObject).getSimpleName());
            paramType.append("<String>)");
            throw xbb.a(paramArrayOfAnnotation, paramInt, paramType.toString(), new Object[0]);
          }
          if (((Class)localObject).isArray())
          {
            paramType = a(((Class)localObject).getComponentType());
            return new pbb.b(paramAnnotation, this.c.c(paramType, paramArrayOfAnnotation), bool).a();
          }
          return new pbb.b(paramAnnotation, this.c.c(paramType, paramArrayOfAnnotation), bool);
        }
        throw xbb.a(this.d, paramInt, "@Field parameters can only be used with form encoding.", new Object[0]);
      }
      if ((paramAnnotation instanceof Pbb))
      {
        a(paramInt, paramType);
        if (this.r)
        {
          localObject = xbb.c(paramType);
          if (Map.class.isAssignableFrom((Class)localObject))
          {
            paramType = xbb.b(paramType, (Class)localObject, Map.class);
            if ((paramType instanceof ParameterizedType))
            {
              localObject = (ParameterizedType)paramType;
              paramType = xbb.a(0, (ParameterizedType)localObject);
              if (String.class == paramType)
              {
                paramType = xbb.a(1, (ParameterizedType)localObject);
                paramType = this.c.c(paramType, paramArrayOfAnnotation);
                this.h = true;
                return new pbb.c(paramType, ((Pbb)paramAnnotation).encoded());
              }
              paramAnnotation = this.d;
              paramArrayOfAnnotation = new StringBuilder();
              paramArrayOfAnnotation.append("@FieldMap keys must be of type String: ");
              paramArrayOfAnnotation.append(paramType);
              throw xbb.a(paramAnnotation, paramInt, paramArrayOfAnnotation.toString(), new Object[0]);
            }
            throw xbb.a(this.d, paramInt, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
          }
          throw xbb.a(this.d, paramInt, "@FieldMap parameter type must be Map.", new Object[0]);
        }
        throw xbb.a(this.d, paramInt, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
      }
      if ((paramAnnotation instanceof _bb))
      {
        a(paramInt, paramType);
        if (this.s)
        {
          _bb local_bb = (_bb)paramAnnotation;
          this.i = true;
          String str = local_bb.value();
          paramAnnotation = xbb.c(paramType);
          if (str.isEmpty())
          {
            if (Iterable.class.isAssignableFrom(paramAnnotation))
            {
              if ((paramType instanceof ParameterizedType))
              {
                if (sZa.b.class.isAssignableFrom(xbb.c(xbb.a(0, (ParameterizedType)paramType)))) {
                  return pbb.k.a.b();
                }
                throw xbb.a(this.d, paramInt, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
              }
              paramArrayOfAnnotation = this.d;
              paramType = new StringBuilder();
              paramType.append(paramAnnotation.getSimpleName());
              paramType.append(" must include generic type (e.g., ");
              paramType.append(paramAnnotation.getSimpleName());
              paramType.append("<String>)");
              throw xbb.a(paramArrayOfAnnotation, paramInt, paramType.toString(), new Object[0]);
            }
            if (paramAnnotation.isArray())
            {
              if (sZa.b.class.isAssignableFrom(paramAnnotation.getComponentType())) {
                return pbb.k.a.a();
              }
              throw xbb.a(this.d, paramInt, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
            }
            if (sZa.b.class.isAssignableFrom(paramAnnotation)) {
              return pbb.k.a;
            }
            throw xbb.a(this.d, paramInt, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("form-data; name=\"");
          ((StringBuilder)localObject).append(str);
          ((StringBuilder)localObject).append("\"");
          localObject = oZa.a(new String[] { "Content-Disposition", ((StringBuilder)localObject).toString(), "Content-Transfer-Encoding", local_bb.encoding() });
          if (Iterable.class.isAssignableFrom(paramAnnotation))
          {
            if ((paramType instanceof ParameterizedType))
            {
              paramType = xbb.a(0, (ParameterizedType)paramType);
              if (!sZa.b.class.isAssignableFrom(xbb.c(paramType))) {
                return new pbb.e((oZa)localObject, this.c.a(paramType, paramArrayOfAnnotation, this.e)).b();
              }
              throw xbb.a(this.d, paramInt, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
            }
            paramType = this.d;
            paramArrayOfAnnotation = new StringBuilder();
            paramArrayOfAnnotation.append(paramAnnotation.getSimpleName());
            paramArrayOfAnnotation.append(" must include generic type (e.g., ");
            paramArrayOfAnnotation.append(paramAnnotation.getSimpleName());
            paramArrayOfAnnotation.append("<String>)");
            throw xbb.a(paramType, paramInt, paramArrayOfAnnotation.toString(), new Object[0]);
          }
          if (paramAnnotation.isArray())
          {
            paramType = a(paramAnnotation.getComponentType());
            if (!sZa.b.class.isAssignableFrom(paramType)) {
              return new pbb.e((oZa)localObject, this.c.a(paramType, paramArrayOfAnnotation, this.e)).a();
            }
            throw xbb.a(this.d, paramInt, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
          }
          if (!sZa.b.class.isAssignableFrom(paramAnnotation)) {
            return new pbb.e((oZa)localObject, this.c.a(paramType, paramArrayOfAnnotation, this.e));
          }
          throw xbb.a(this.d, paramInt, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
        }
        throw xbb.a(this.d, paramInt, "@Part parameters can only be used with multipart encoding.", new Object[0]);
      }
      if ((paramAnnotation instanceof acb))
      {
        a(paramInt, paramType);
        if (this.s)
        {
          this.i = true;
          localObject = xbb.c(paramType);
          if (Map.class.isAssignableFrom((Class)localObject))
          {
            paramType = xbb.b(paramType, (Class)localObject, Map.class);
            if ((paramType instanceof ParameterizedType))
            {
              localObject = (ParameterizedType)paramType;
              paramType = xbb.a(0, (ParameterizedType)localObject);
              if (String.class == paramType)
              {
                paramType = xbb.a(1, (ParameterizedType)localObject);
                if (!sZa.b.class.isAssignableFrom(xbb.c(paramType))) {
                  return new pbb.f(this.c.a(paramType, paramArrayOfAnnotation, this.e), ((acb)paramAnnotation).encoding());
                }
                throw xbb.a(this.d, paramInt, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
              }
              paramArrayOfAnnotation = this.d;
              paramAnnotation = new StringBuilder();
              paramAnnotation.append("@PartMap keys must be of type String: ");
              paramAnnotation.append(paramType);
              throw xbb.a(paramArrayOfAnnotation, paramInt, paramAnnotation.toString(), new Object[0]);
            }
            throw xbb.a(this.d, paramInt, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
          }
          throw xbb.a(this.d, paramInt, "@PartMap parameter type must be Map.", new Object[0]);
        }
        throw xbb.a(this.d, paramInt, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
      }
      if ((paramAnnotation instanceof Mbb))
      {
        a(paramInt, paramType);
        if ((!this.r) && (!this.s))
        {
          if (!this.j) {
            try
            {
              paramArrayOfAnnotation = this.c.a(paramType, paramArrayOfAnnotation, this.e);
              this.j = true;
              return new pbb.a(paramArrayOfAnnotation);
            }
            catch (RuntimeException paramArrayOfAnnotation)
            {
              throw xbb.a(this.d, paramArrayOfAnnotation, paramInt, "Unable to create @Body converter for %s", new Object[] { paramType });
            }
          }
          throw xbb.a(this.d, paramInt, "Multiple @Body method annotations found.", new Object[0]);
        }
        throw xbb.a(this.d, paramInt, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
      }
      return null;
    }
    
    private void a(int paramInt, String paramString)
    {
      if (b.matcher(paramString).matches())
      {
        if (this.w.contains(paramString)) {
          return;
        }
        throw xbb.a(this.d, paramInt, "URL \"%s\" does not contain \"{%s}\".", new Object[] { this.t, paramString });
      }
      throw xbb.a(this.d, paramInt, "@Path parameter name must match %s. Found: %s", new Object[] { a.pattern(), paramString });
    }
    
    private void a(int paramInt, Type paramType)
    {
      if (!xbb.d(paramType)) {
        return;
      }
      throw xbb.a(this.d, paramInt, "Parameter type must not include a type variable or wildcard: %s", new Object[] { paramType });
    }
    
    private void a(String paramString1, String paramString2, boolean paramBoolean)
    {
      String str = this.p;
      if (str == null)
      {
        this.p = paramString1;
        this.q = paramBoolean;
        if (paramString2.isEmpty()) {
          return;
        }
        int i1 = paramString2.indexOf('?');
        if ((i1 != -1) && (i1 < paramString2.length() - 1))
        {
          paramString1 = paramString2.substring(i1 + 1);
          if (a.matcher(paramString1).find()) {
            throw xbb.a(this.d, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", new Object[] { paramString1 });
          }
        }
        this.t = paramString2;
        this.w = a(paramString2);
        return;
      }
      throw xbb.a(this.d, "Only one HTTP method is allowed. Found: %s and %s.", new Object[] { str, paramString1 });
    }
    
    private void a(Annotation paramAnnotation)
    {
      if ((paramAnnotation instanceof Nbb))
      {
        a("DELETE", ((Nbb)paramAnnotation).value(), false);
      }
      else if ((paramAnnotation instanceof Qbb))
      {
        a("GET", ((Qbb)paramAnnotation).value(), false);
      }
      else if ((paramAnnotation instanceof Rbb))
      {
        a("HEAD", ((Rbb)paramAnnotation).value(), false);
      }
      else if ((paramAnnotation instanceof Xbb))
      {
        a("PATCH", ((Xbb)paramAnnotation).value(), true);
      }
      else if ((paramAnnotation instanceof Ybb))
      {
        a("POST", ((Ybb)paramAnnotation).value(), true);
      }
      else if ((paramAnnotation instanceof Zbb))
      {
        a("PUT", ((Zbb)paramAnnotation).value(), true);
      }
      else if ((paramAnnotation instanceof Wbb))
      {
        a("OPTIONS", ((Wbb)paramAnnotation).value(), false);
      }
      else if ((paramAnnotation instanceof Sbb))
      {
        paramAnnotation = (Sbb)paramAnnotation;
        a(paramAnnotation.method(), paramAnnotation.path(), paramAnnotation.hasBody());
      }
      else if ((paramAnnotation instanceof Ubb))
      {
        paramAnnotation = ((Ubb)paramAnnotation).value();
        if (paramAnnotation.length != 0) {
          this.u = a(paramAnnotation);
        } else {
          throw xbb.a(this.d, "@Headers annotation is empty.", new Object[0]);
        }
      }
      else if ((paramAnnotation instanceof Vbb))
      {
        if (!this.r) {
          this.s = true;
        } else {
          throw xbb.a(this.d, "Only one encoding annotation is allowed.", new Object[0]);
        }
      }
    }
    
    sbb a()
    {
      Annotation[] arrayOfAnnotation = this.e;
      int i1 = arrayOfAnnotation.length;
      for (int i2 = 0; i2 < i1; i2++) {
        a(arrayOfAnnotation[i2]);
      }
      if (this.p != null)
      {
        if (!this.q) {
          if (!this.s)
          {
            if (this.r) {
              throw xbb.a(this.d, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            }
          }
          else {
            throw xbb.a(this.d, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
          }
        }
        i1 = this.f.length;
        this.x = new pbb[i1];
        for (i2 = 0; i2 < i1; i2++) {
          this.x[i2] = a(i2, this.g[i2], this.f[i2]);
        }
        if ((this.t == null) && (!this.o)) {
          throw xbb.a(this.d, "Missing either @%s URL or @Url parameter.", new Object[] { this.p });
        }
        if ((!this.r) && (!this.s) && (!this.q) && (this.j)) {
          throw xbb.a(this.d, "Non-body HTTP method cannot contain @Body.", new Object[0]);
        }
        if ((this.r) && (!this.h)) {
          throw xbb.a(this.d, "Form-encoded method must contain at least one @Field.", new Object[0]);
        }
        if ((this.s) && (!this.i)) {
          throw xbb.a(this.d, "Multipart method must contain at least one @Part.", new Object[0]);
        }
        return new sbb(this);
      }
      throw xbb.a(this.d, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */