    /**
    * репозиторий
    */
public class Main {
    public static void main(String[] args) {

//        Client client1 = new Client(12345, "a b", "m", "19991026", 1513134734);
//        Client client2 = new Client(12346, "a b", "m", "19991026", 1513134734);
//        Client client3 = new Client(12347, "a b", "m", "19991026", 1513134734);

//        ContractInternet contractInternet1 = new ContractInternet(12334, "20201130", "20210230", 1, client1, 100);
//        ContractMobile contractMobile1 = new ContractMobile(13234, "20201130", "20210323", 1, client2, 10,10,10);
//        ContractTV contractTV1 = new ContractTV(12332, "20201130", "20210230", 1, client3, 100);
//

        /**
         * динамический массив, который хранит контракты
         */
          MyArrayList<ContractDefault> listContracts = new MyArrayList<>();


//        listContracts.add(contractInternet1);
//        listContracts.add(contractMobile1);
//        listContracts.add(contractTV1);
//        System.out.println(findContract(listContracts, 12332));
//        deleteContract(listContracts, 12332);
//        System.out.println(findContract(listContracts,12332));
    }

        /**
         * метод поиска контракта по ID контракта
         * @param listContracts - место хранения контрактов
         * @param contractID - ID контракта
         * @return - возвращает контракт с искомым ID
         */
    public static Object findContract(MyArrayList<ContractDefault> listContracts, int contractID){
        for (int i = 0; i < listContracts.size(); i++) {
            if (listContracts.get(i).getContractID() == contractID) {
                return listContracts.get(i);
            }
        }   return null;
    }

        /**
         * метод удаления контракта по ID контракта
         * @param listContracts - место хранения контрактов
         * @param contractID - ID контракта
         */
    public static void deleteContract(MyArrayList<ContractDefault> listContracts, int contractID){
        for (int i = 0; i < listContracts.size(); i++) {
            if (listContracts.get(i).getContractID() == contractID) {
                listContracts.remove(i);
            }
        }
    }

        /**
         * обобщённый класс, который позволяет создать динамический массив, а так же описывает
         * некоторые методы по изменению массива по его индексам
         * @param <T> - вводимый тип данных
         */
    public static class MyArrayList<T> {
        private final int INIT_SIZE = 16;
        private final int CUT_RATE = 4;
        private Object[] array = new Object[INIT_SIZE];
        private int pointer = 0;

        /**
         * метод добавляет новый элемент в список. При достижении размера внутреннего
         * массива происходит его увеличение в два раза.
         * @param item - вводимый объект в массив
         */
        public void add(T item) {
            if(pointer == array.length-1)
                resize(array.length*2); // увеличу в 2 раза, если достигли границ
            array[pointer++] = item;
        }

        /**
         * метод возвращает элемент списка по индексу.
         *
         * @param index - вводимый индекс массива
         * @return - возвращает объект определенного индекса
         */
        public T get(int index) {
            return (T) array[index];
        }

        /**
         * Удаляет элемент списка по индексу. Все элементы справа от удаляемого
         * перемещаются на шаг налево. Если после удаления элемента количество
         * элементов стало в CUT_RATE раз меньше чем размер внутреннего массива,
         * то внутренний массив уменьшается в два раза
         * @param index - вводимый индекс массива
         */
        public void remove(int index) {
            for (int i = index; i<pointer; i++)
                array[i] = array[i+1];
            array[pointer] = null;
            pointer--;
            if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
                resize(array.length/2);
        }

            /**
             * Возвращает количество элементов в массиве
             * @return - число элементов в массиве
             */
        public int size() {
            return pointer;
        }

            /**
             * Вспомогательный метод для масштабирования
             * @param newLength - новая длина массива
             */
        private void resize(int newLength) {
            Object[] newArray = new Object[newLength];
            System.arraycopy(array, 0, newArray, 0, pointer);
            array = newArray;
        }
    }
}
