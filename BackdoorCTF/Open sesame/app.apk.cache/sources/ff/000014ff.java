package kotlin.reflect;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: TypesJVM.kt */
@Metadata(m26d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bc\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m25d2 = {"Lkotlin/reflect/TypeImpl;", "Ljava/lang/reflect/Type;", "getTypeName", "", "kotlin-stdlib"}, m24k = 1, m23mv = {1, 8, 0}, m21xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
interface TypeImpl extends Type {
    @Override // kotlin.reflect.TypeImpl
    String getTypeName();
}