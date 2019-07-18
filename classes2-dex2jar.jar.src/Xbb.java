import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;

final class xbb
{
  static final Type[] a = new Type[0];
  
  private static int a(Object[] paramArrayOfObject, Object paramObject)
  {
    for (int i = 0; i < paramArrayOfObject.length; i++) {
      if (paramObject.equals(paramArrayOfObject[i])) {
        return i;
      }
    }
    throw new NoSuchElementException();
  }
  
  static DZa a(DZa paramDZa)
    throws IOException
  {
    jab localjab = new jab();
    paramDZa.e().a(localjab);
    return DZa.a(paramDZa.d(), paramDZa.c(), localjab);
  }
  
  private static Class<?> a(TypeVariable<?> paramTypeVariable)
  {
    paramTypeVariable = paramTypeVariable.getGenericDeclaration();
    if ((paramTypeVariable instanceof Class)) {
      paramTypeVariable = (Class)paramTypeVariable;
    } else {
      paramTypeVariable = null;
    }
    return paramTypeVariable;
  }
  
  static <T> T a(T paramT, String paramString)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException(paramString);
  }
  
  static RuntimeException a(Method paramMethod, int paramInt, String paramString, Object... paramVarArgs)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" (parameter #");
    localStringBuilder.append(paramInt + 1);
    localStringBuilder.append(")");
    return a(paramMethod, localStringBuilder.toString(), paramVarArgs);
  }
  
  static RuntimeException a(Method paramMethod, String paramString, Object... paramVarArgs)
  {
    return a(paramMethod, null, paramString, paramVarArgs);
  }
  
  static RuntimeException a(Method paramMethod, Throwable paramThrowable, int paramInt, String paramString, Object... paramVarArgs)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" (parameter #");
    localStringBuilder.append(paramInt + 1);
    localStringBuilder.append(")");
    return a(paramMethod, paramThrowable, localStringBuilder.toString(), paramVarArgs);
  }
  
  static RuntimeException a(Method paramMethod, Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    paramVarArgs = String.format(paramString, paramVarArgs);
    paramString = new StringBuilder();
    paramString.append(paramVarArgs);
    paramString.append("\n    for method ");
    paramString.append(paramMethod.getDeclaringClass().getSimpleName());
    paramString.append(".");
    paramString.append(paramMethod.getName());
    return new IllegalArgumentException(paramString.toString(), paramThrowable);
  }
  
  static Type a(int paramInt, ParameterizedType paramParameterizedType)
  {
    Type[] arrayOfType = paramParameterizedType.getActualTypeArguments();
    if ((paramInt >= 0) && (paramInt < arrayOfType.length))
    {
      localObject = arrayOfType[paramInt];
      paramParameterizedType = (ParameterizedType)localObject;
      if ((localObject instanceof WildcardType)) {
        paramParameterizedType = ((WildcardType)localObject).getUpperBounds()[0];
      }
      return paramParameterizedType;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Index ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(" not in range [0,");
    ((StringBuilder)localObject).append(arrayOfType.length);
    ((StringBuilder)localObject).append(") for ");
    ((StringBuilder)localObject).append(paramParameterizedType);
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  static Type a(Type paramType, Class<?> paramClass1, Class<?> paramClass2)
  {
    if (paramClass2 == paramClass1) {
      return paramType;
    }
    if (paramClass2.isInterface())
    {
      paramType = paramClass1.getInterfaces();
      int i = 0;
      int j = paramType.length;
      while (i < j)
      {
        if (paramType[i] == paramClass2) {
          return paramClass1.getGenericInterfaces()[i];
        }
        if (paramClass2.isAssignableFrom(paramType[i])) {
          return a(paramClass1.getGenericInterfaces()[i], paramType[i], paramClass2);
        }
        i++;
      }
    }
    if (!paramClass1.isInterface()) {
      while (paramClass1 != Object.class)
      {
        paramType = paramClass1.getSuperclass();
        if (paramType == paramClass2) {
          return paramClass1.getGenericSuperclass();
        }
        if (paramClass2.isAssignableFrom(paramType)) {
          return a(paramClass1.getGenericSuperclass(), paramType, paramClass2);
        }
        paramClass1 = paramType;
      }
    }
    return paramClass2;
  }
  
  static Type a(Type paramType1, Class<?> paramClass, Type paramType2)
  {
    while ((paramType2 instanceof TypeVariable))
    {
      localObject1 = (TypeVariable)paramType2;
      paramType2 = a(paramType1, paramClass, (TypeVariable)localObject1);
      if (paramType2 == localObject1) {
        return paramType2;
      }
    }
    if ((paramType2 instanceof Class))
    {
      localObject1 = (Class)paramType2;
      if (((Class)localObject1).isArray())
      {
        paramType2 = ((Class)localObject1).getComponentType();
        paramType1 = a(paramType1, paramClass, paramType2);
        if (paramType2 == paramType1) {
          paramType1 = (Type)localObject1;
        } else {
          paramType1 = new xbb.a(paramType1);
        }
        return paramType1;
      }
    }
    if ((paramType2 instanceof GenericArrayType))
    {
      paramType2 = (GenericArrayType)paramType2;
      localObject1 = paramType2.getGenericComponentType();
      paramType1 = a(paramType1, paramClass, (Type)localObject1);
      if (localObject1 == paramType1) {
        paramType1 = paramType2;
      } else {
        paramType1 = new xbb.a(paramType1);
      }
      return paramType1;
    }
    boolean bool = paramType2 instanceof ParameterizedType;
    int i = 0;
    Object localObject2;
    Object localObject3;
    if (bool)
    {
      localObject2 = (ParameterizedType)paramType2;
      paramType2 = ((ParameterizedType)localObject2).getOwnerType();
      localObject3 = a(paramType1, paramClass, paramType2);
      int j;
      if (localObject3 != paramType2) {
        j = 1;
      } else {
        j = 0;
      }
      paramType2 = ((ParameterizedType)localObject2).getActualTypeArguments();
      int k = paramType2.length;
      while (i < k)
      {
        Type localType = a(paramType1, paramClass, paramType2[i]);
        int m = j;
        localObject1 = paramType2;
        if (localType != paramType2[i])
        {
          m = j;
          localObject1 = paramType2;
          if (j == 0)
          {
            localObject1 = (Type[])paramType2.clone();
            m = 1;
          }
          localObject1[i] = localType;
        }
        i++;
        j = m;
        paramType2 = (Type)localObject1;
      }
      if (j != 0) {
        paramType1 = new xbb.b((Type)localObject3, ((ParameterizedType)localObject2).getRawType(), paramType2);
      } else {
        paramType1 = (Type)localObject2;
      }
      return paramType1;
    }
    Object localObject1 = paramType2;
    if ((paramType2 instanceof WildcardType))
    {
      paramType2 = (WildcardType)paramType2;
      localObject3 = paramType2.getLowerBounds();
      localObject2 = paramType2.getUpperBounds();
      if (localObject3.length == 1)
      {
        paramType1 = a(paramType1, paramClass, localObject3[0]);
        localObject1 = paramType2;
        if (paramType1 != localObject3[0]) {
          return new xbb.c(new Type[] { Object.class }, new Type[] { paramType1 });
        }
      }
      else
      {
        localObject1 = paramType2;
        if (localObject2.length == 1) {
          localObject1 = localObject2[0];
        }
      }
    }
    try
    {
      paramType1 = a(paramType1, paramClass, (Type)localObject1);
      localObject1 = paramType2;
      if (paramType1 != localObject2[0])
      {
        paramClass = a;
        return new xbb.c(new Type[] { paramType1 }, paramClass);
      }
      return (Type)localObject1;
    }
    catch (Throwable paramType1)
    {
      throw paramType1;
    }
  }
  
  private static Type a(Type paramType, Class<?> paramClass, TypeVariable<?> paramTypeVariable)
  {
    Class localClass = a(paramTypeVariable);
    if (localClass == null) {
      return paramTypeVariable;
    }
    paramType = a(paramType, paramClass, localClass);
    if ((paramType instanceof ParameterizedType))
    {
      int i = a(localClass.getTypeParameters(), paramTypeVariable);
      return ((ParameterizedType)paramType).getActualTypeArguments()[i];
    }
    return paramTypeVariable;
  }
  
  static <T> void a(Class<T> paramClass)
  {
    if (paramClass.isInterface())
    {
      if (paramClass.getInterfaces().length <= 0) {
        return;
      }
      throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
    }
    throw new IllegalArgumentException("API declarations must be interfaces.");
  }
  
  static void a(Throwable paramThrowable)
  {
    if (!(paramThrowable instanceof VirtualMachineError))
    {
      if (!(paramThrowable instanceof ThreadDeath))
      {
        if (!(paramThrowable instanceof LinkageError)) {
          return;
        }
        throw ((LinkageError)paramThrowable);
      }
      throw ((ThreadDeath)paramThrowable);
    }
    throw ((VirtualMachineError)paramThrowable);
  }
  
  static void a(Type paramType)
  {
    if (((paramType instanceof Class)) && (((Class)paramType).isPrimitive())) {
      throw new IllegalArgumentException();
    }
  }
  
  static boolean a(Type paramType1, Type paramType2)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = true;
    if (paramType1 == paramType2) {
      return true;
    }
    if ((paramType1 instanceof Class)) {
      return paramType1.equals(paramType2);
    }
    if ((paramType1 instanceof ParameterizedType))
    {
      if (!(paramType2 instanceof ParameterizedType)) {
        return false;
      }
      paramType1 = (ParameterizedType)paramType1;
      ParameterizedType localParameterizedType = (ParameterizedType)paramType2;
      paramType2 = paramType1.getOwnerType();
      Type localType = localParameterizedType.getOwnerType();
      if (((paramType2 != localType) && ((paramType2 == null) || (!paramType2.equals(localType)))) || (!paramType1.getRawType().equals(localParameterizedType.getRawType())) || (!Arrays.equals(paramType1.getActualTypeArguments(), localParameterizedType.getActualTypeArguments()))) {
        bool3 = false;
      }
      return bool3;
    }
    if ((paramType1 instanceof GenericArrayType))
    {
      if (!(paramType2 instanceof GenericArrayType)) {
        return false;
      }
      paramType1 = (GenericArrayType)paramType1;
      paramType2 = (GenericArrayType)paramType2;
      return a(paramType1.getGenericComponentType(), paramType2.getGenericComponentType());
    }
    if ((paramType1 instanceof WildcardType))
    {
      if (!(paramType2 instanceof WildcardType)) {
        return false;
      }
      paramType1 = (WildcardType)paramType1;
      paramType2 = (WildcardType)paramType2;
      if ((Arrays.equals(paramType1.getUpperBounds(), paramType2.getUpperBounds())) && (Arrays.equals(paramType1.getLowerBounds(), paramType2.getLowerBounds()))) {
        bool3 = bool1;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    if ((paramType1 instanceof TypeVariable))
    {
      if (!(paramType2 instanceof TypeVariable)) {
        return false;
      }
      paramType1 = (TypeVariable)paramType1;
      paramType2 = (TypeVariable)paramType2;
      if ((paramType1.getGenericDeclaration() == paramType2.getGenericDeclaration()) && (paramType1.getName().equals(paramType2.getName()))) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    return false;
  }
  
  static boolean a(Annotation[] paramArrayOfAnnotation, Class<? extends Annotation> paramClass)
  {
    int i = paramArrayOfAnnotation.length;
    for (int j = 0; j < i; j++) {
      if (paramClass.isInstance(paramArrayOfAnnotation[j])) {
        return true;
      }
    }
    return false;
  }
  
  static Type b(Type paramType)
  {
    if ((paramType instanceof ParameterizedType)) {
      return a(0, (ParameterizedType)paramType);
    }
    throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
  }
  
  static Type b(Type paramType, Class<?> paramClass1, Class<?> paramClass2)
  {
    if (paramClass2.isAssignableFrom(paramClass1)) {
      return a(paramType, paramClass1, a(paramType, paramClass1, paramClass2));
    }
    throw new IllegalArgumentException();
  }
  
  static Class<?> c(Type paramType)
  {
    a(paramType, "type == null");
    if ((paramType instanceof Class)) {
      return (Class)paramType;
    }
    if ((paramType instanceof ParameterizedType))
    {
      paramType = ((ParameterizedType)paramType).getRawType();
      if ((paramType instanceof Class)) {
        return (Class)paramType;
      }
      throw new IllegalArgumentException();
    }
    if ((paramType instanceof GenericArrayType)) {
      return Array.newInstance(c(((GenericArrayType)paramType).getGenericComponentType()), 0).getClass();
    }
    if ((paramType instanceof TypeVariable)) {
      return Object.class;
    }
    if ((paramType instanceof WildcardType)) {
      return c(((WildcardType)paramType).getUpperBounds()[0]);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
    localStringBuilder.append(paramType);
    localStringBuilder.append("> is of type ");
    localStringBuilder.append(paramType.getClass().getName());
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  static boolean d(Type paramType)
  {
    if ((paramType instanceof Class)) {
      return false;
    }
    if ((paramType instanceof ParameterizedType))
    {
      paramType = ((ParameterizedType)paramType).getActualTypeArguments();
      int i = paramType.length;
      for (int j = 0; j < i; j++) {
        if (d(paramType[j])) {
          return true;
        }
      }
      return false;
    }
    if ((paramType instanceof GenericArrayType)) {
      return d(((GenericArrayType)paramType).getGenericComponentType());
    }
    if ((paramType instanceof TypeVariable)) {
      return true;
    }
    if ((paramType instanceof WildcardType)) {
      return true;
    }
    String str;
    if (paramType == null) {
      str = "null";
    } else {
      str = paramType.getClass().getName();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
    localStringBuilder.append(paramType);
    localStringBuilder.append("> is of type ");
    localStringBuilder.append(str);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  static String e(Type paramType)
  {
    if ((paramType instanceof Class)) {
      paramType = ((Class)paramType).getName();
    } else {
      paramType = paramType.toString();
    }
    return paramType;
  }
  
  private static final class a
    implements GenericArrayType
  {
    private final Type a;
    
    a(Type paramType)
    {
      this.a = paramType;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (((paramObject instanceof GenericArrayType)) && (xbb.a(this, (GenericArrayType)paramObject))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Type getGenericComponentType()
    {
      return this.a;
    }
    
    public int hashCode()
    {
      return this.a.hashCode();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(xbb.e(this.a));
      localStringBuilder.append("[]");
      return localStringBuilder.toString();
    }
  }
  
  private static final class b
    implements ParameterizedType
  {
    private final Type a;
    private final Type b;
    private final Type[] c;
    
    b(Type paramType1, Type paramType2, Type... paramVarArgs)
    {
      boolean bool = paramType2 instanceof Class;
      int i = 0;
      if (bool)
      {
        j = 1;
        if (paramType1 == null) {
          k = 1;
        } else {
          k = 0;
        }
        if (((Class)paramType2).getEnclosingClass() != null) {
          j = 0;
        }
        if (k != j) {
          throw new IllegalArgumentException();
        }
      }
      int j = paramVarArgs.length;
      for (int k = i; k < j; k++)
      {
        Type localType = paramVarArgs[k];
        xbb.a(localType, "typeArgument == null");
        xbb.a(localType);
      }
      this.a = paramType1;
      this.b = paramType2;
      this.c = ((Type[])paramVarArgs.clone());
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (((paramObject instanceof ParameterizedType)) && (xbb.a(this, (ParameterizedType)paramObject))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Type[] getActualTypeArguments()
    {
      return (Type[])this.c.clone();
    }
    
    public Type getOwnerType()
    {
      return this.a;
    }
    
    public Type getRawType()
    {
      return this.b;
    }
    
    public int hashCode()
    {
      int i = Arrays.hashCode(this.c);
      int j = this.b.hashCode();
      Type localType = this.a;
      int k;
      if (localType != null) {
        k = localType.hashCode();
      } else {
        k = 0;
      }
      return i ^ j ^ k;
    }
    
    public String toString()
    {
      Object localObject = this.c;
      if (localObject.length == 0) {
        return xbb.e(this.b);
      }
      int i = localObject.length;
      int j = 1;
      localObject = new StringBuilder((i + 1) * 30);
      ((StringBuilder)localObject).append(xbb.e(this.b));
      ((StringBuilder)localObject).append("<");
      ((StringBuilder)localObject).append(xbb.e(this.c[0]));
      while (j < this.c.length)
      {
        ((StringBuilder)localObject).append(", ");
        ((StringBuilder)localObject).append(xbb.e(this.c[j]));
        j++;
      }
      ((StringBuilder)localObject).append(">");
      return ((StringBuilder)localObject).toString();
    }
  }
  
  private static final class c
    implements WildcardType
  {
    private final Type a;
    private final Type b;
    
    c(Type[] paramArrayOfType1, Type[] paramArrayOfType2)
    {
      if (paramArrayOfType2.length <= 1)
      {
        if (paramArrayOfType1.length == 1)
        {
          if (paramArrayOfType2.length == 1)
          {
            if (paramArrayOfType2[0] != null)
            {
              xbb.a(paramArrayOfType2[0]);
              if (paramArrayOfType1[0] == Object.class)
              {
                this.b = paramArrayOfType2[0];
                this.a = Object.class;
              }
              else
              {
                throw new IllegalArgumentException();
              }
            }
            else
            {
              throw new NullPointerException();
            }
          }
          else
          {
            if (paramArrayOfType1[0] == null) {
              break label99;
            }
            xbb.a(paramArrayOfType1[0]);
            this.b = null;
            this.a = paramArrayOfType1[0];
          }
          return;
          label99:
          throw new NullPointerException();
        }
        throw new IllegalArgumentException();
      }
      throw new IllegalArgumentException();
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (((paramObject instanceof WildcardType)) && (xbb.a(this, (WildcardType)paramObject))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Type[] getLowerBounds()
    {
      Type localType = this.b;
      Type[] arrayOfType;
      if (localType != null)
      {
        arrayOfType = new Type[1];
        arrayOfType[0] = localType;
      }
      else
      {
        arrayOfType = xbb.a;
      }
      return arrayOfType;
    }
    
    public Type[] getUpperBounds()
    {
      return new Type[] { this.a };
    }
    
    public int hashCode()
    {
      Type localType = this.b;
      int i;
      if (localType != null) {
        i = localType.hashCode() + 31;
      } else {
        i = 1;
      }
      return i ^ this.a.hashCode() + 31;
    }
    
    public String toString()
    {
      if (this.b != null)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("? super ");
        localStringBuilder.append(xbb.e(this.b));
        return localStringBuilder.toString();
      }
      if (this.a == Object.class) {
        return "?";
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("? extends ");
      localStringBuilder.append(xbb.e(this.a));
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */