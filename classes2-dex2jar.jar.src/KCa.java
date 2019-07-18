import android.graphics.Bitmap;

public final class kCa
  extends _Ba
{
  public kCa()
  {
    super("\n#ifdef GL_ES\nprecision mediump float;\n#endif\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D tatooTexture;\nuniform lowp float intensity;\n\nvoid main()\n{\n    vec3 tex  = texture2D(inputImageTexture, textureCoordinate).rgb;\n    vec4 tat  = texture2D(tatooTexture, textureCoordinate).rgba;\n    vec4 tat2 = tat * 0.20;\n\n    vec3 dark = mix(tex * tex * tex * tex, vec3(0.0), 0.2);\n    vec3 skin = mix(tex, dark, tat.a);\n    vec3 tint = skin * (1.0 - tat2.a) + tat2.rgb;\n\n    gl_FragColor = vec4(mix(tex, tint, intensity), 1.0);\n}\n", new String[] { "tatooTexture" }, 0, 4, null);
  }
  
  public final void a(Bitmap paramBitmap)
  {
    oXa.b(paramBitmap, "value");
    a("tatooTexture", paramBitmap);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/kCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */