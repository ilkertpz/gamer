package com.gamerface.model.common;

/**
 * @param <R>: Use Case Result Type
 * @param <P>: Use Case Parameter Type
 */
public interface UseCaseHandler<R,P> {

  R handle(P useCaseParam) throws Exception;

}
