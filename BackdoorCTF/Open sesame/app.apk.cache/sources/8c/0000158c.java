package kotlin.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m26d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b¨\u0006\u0003"}, m25d2 = {"toRegex", "Lkotlin/text/Regex;", "Ljava/util/regex/Pattern;", "kotlin-stdlib"}, m24k = 5, m23mv = {1, 8, 0}, m21xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, m20xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.StringsKt__RegexExtensionsJVMKt */
/* loaded from: classes.dex */
public class RegexExtensionsJVM extends Indent {
    private static final Regex toRegex(Pattern pattern) {
        Intrinsics.checkNotNullParameter(pattern, "<this>");
        return new Regex(pattern);
    }
}