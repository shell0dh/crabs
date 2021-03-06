package com.code.crabs.jdbc.lang.extension.expression;

import com.code.crabs.core.DataType;
import com.code.crabs.exception.SQL4ESException;
import com.code.crabs.jdbc.lang.Expression;
import com.code.crabs.jdbc.lang.expression.NonAggregation;

public final class IsNotNullExpression extends NonAggregation {

    public IsNotNullExpression(final Expression expression) {
        super(expression);
    }

    @Override
    protected final String doToString() {
        return this.getOperandExpression(0).toString() + " IS NOT NULL";
    }

    @Override
    public final DataType getResultType() throws SQL4ESException {
        return DataType.BOOLEAN;
    }

}
