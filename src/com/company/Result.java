package com.company;

public class Result {
    private final ResultType resultType;
    private String message;

    private Result(ResultType resultType) {
        this.resultType = resultType;
    }

    public static Result ok() {
        return new Result(ResultType.Ok);
    }

    public static Result error(String message) {
        Result result = new Result(ResultType.Error);
        result.message = message;
        return result;
    }

    public ResultType getResultType() {
        return resultType;
    }

    public String getErrorMessage() {
        return message;
    }
}
