class N<T> {
    public data: number;
    public next: N<T> | null = null;

    constructor(data: number, next: N<T> | null = null) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    private head: N<number> | null = null;
    private tail: N<number> | null = null;

    get(index: number): number {
        if (index < 0) {
            return -1;
        }

        let node = this.head;
        let count = 0;

        while (node !== null) {
            if (count === index) {
                return node.data;
            }

            node = node.next;
            count++;
        }

        return -1;
    }

    insertHead(val: number): void {
        const node = new N(val, this.head);

        this.head = node;

        if (this.tail === null) {
            this.tail = node;
        }
    }

    insertTail(val: number): void {
        const node = new N(val);

        if (this.head === null) {
            this.head = node;
            this.tail = node;
            return;
        }

        this.tail!.next = node;
        this.tail = node;
    }

    remove(index: number): boolean {
        if (index < 0 || this.head === null) {
            return false;
        }

        if (index === 0) {
            this.head = this.head.next;

            if (this.head === null) {
                this.tail = null;
            }

            return true;
        }

        let previous = this.head;
        let current = this.head.next;
        let count = 1;

        while (current !== null) {
            if (count === index) {
                previous.next = current.next;

                if (current === this.tail) {
                    this.tail = previous;
                }

                return true;
            }

            previous = current;
            current = current.next;
            count++;
        }

        return false;
    }

    getValues(): number[] {
        const numbers: number[] = [];

        let node = this.head;

        while (node !== null) {
            numbers.push(node.data);
            node = node.next;
        }

        return numbers;
    }
}