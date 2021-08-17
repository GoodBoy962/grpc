package ru.tinkoff.sirius.grpc.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import ru.tinkoff.sirius.grpc.AccountServiceGrpc;
import ru.tinkoff.sirius.grpc.CreateAccountRequest;
import ru.tinkoff.sirius.grpc.CreateAccountResponse;

@GrpcService
public class AccountService extends AccountServiceGrpc.AccountServiceImplBase {

    @Override
    public void create(CreateAccountRequest request, StreamObserver<CreateAccountResponse> responseObserver) {
//        var account = request.getId() + "-" + UUID.randomUUID() + "-" + request.getLogin();
//        responseObserver.onNext(CreateAccountResponse.newBuilder()
//                .setAccount(account)
//                .build());
//        responseObserver.onCompleted();
    }
}
