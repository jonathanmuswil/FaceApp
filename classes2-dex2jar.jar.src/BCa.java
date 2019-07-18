import android.graphics.Bitmap;

public final class bCa
  extends OBa
{
  public bCa()
  {
    super("\n#ifdef GL_ES\nprecision mediump float;\n#endif\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D depthTexture;\nuniform sampler2D blur1Texture;\nuniform sampler2D blur2Texture;\nuniform lowp float aperture;\nuniform lowp float focallength;\n\nvec3 mixTex(float factor) {\n    vec3 res;\n    if (factor < 0.2) {\n       vec3 b0 = texture2D(inputImageTexture, textureCoordinate).rgb;\n       res = b0;\n    } else if (factor < 0.5) {\n       vec3 b0 = texture2D(inputImageTexture, textureCoordinate).rgb;\n       vec3 b1 = texture2D(blur1Texture, textureCoordinate).rgb;\n       res = mix(b0, b1, smoothstep(0.2, 0.5, factor));\n    } else {\n       vec3 b1 = texture2D(blur1Texture, textureCoordinate).rgb;\n       vec3 b2 = texture2D(blur2Texture, textureCoordinate).rgb;\n       res = mix(b1, b2, smoothstep(0.5, 1.0, factor));\n    }\n    return res;\n}\n\nvoid main()\n{\n    float depth  = texture2D(depthTexture, textureCoordinate).r;\n    float factor = sqrt(1.5 * abs(focallength - depth));\n    gl_FragColor = vec4(mixTex(factor), 1.0);\n}\n", new String[] { "depthTexture", "blur1Texture", "blur2Texture", "aperture", "focallength" }, 0, 4, null);
  }
  
  public final void a(float paramFloat)
  {
    a("focallength", Float.valueOf(paramFloat));
  }
  
  public final void a(Bitmap paramBitmap)
  {
    oXa.b(paramBitmap, "value");
    a("blur1Texture", paramBitmap);
  }
  
  public final void b(Bitmap paramBitmap)
  {
    oXa.b(paramBitmap, "value");
    a("blur2Texture", paramBitmap);
  }
  
  public final void c(Bitmap paramBitmap)
  {
    oXa.b(paramBitmap, "value");
    a("depthTexture", paramBitmap);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */