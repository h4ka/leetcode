import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Reconciler {

    Stream<PendingTransaction> reconcile(Stream<PendingTransaction> pending, Stream<Stream<ProcessedTransaction>> processed) {

        Stream<PendingTransaction> resStream = Stream.of();

        if (pending != null || processed != null){

            Stream<ProcessedTransaction> flatMappedStream = processed.flatMap(Function.identity());

            Map<String, ProcessedTransaction> mapOfProcessed = flatMappedStream
                    .filter(processedTransaction -> processedTransaction.getId() != null && !processedTransaction.getId().isEmpty())
                    .filter(processedTransaction -> processedTransaction.getStatus().isPresent() && processedTransaction.getStatus().toString().equalsIgnoreCase("DONE") )
                    .collect(Collectors.toMap(ProcessedTransaction::getId, Function.identity()));

            return pending != null ? pending.filter(pendingTransaction -> pendingTransaction != null && mapOfProcessed.containsKey(pendingTransaction.getId().toString())) : resStream;



        } else {
            return resStream;
        }
    }

    private class PendingTransaction {
        Long id;
        Optional<String> status;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Optional<String> getStatus() {
            return status;
        }

        public void setStatus(Optional<String> status) {
            this.status = status;
        }

    }

    private class ProcessedTransaction {
        String id;
        Optional<String> status;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Optional<String> getStatus() {
            return status;
        }

        public void setStatus(Optional<String> status) {
            this.status = status;
        }
    }

}