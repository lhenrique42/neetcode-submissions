class DynamicArray {
    private items: number[] = [];
    private size: number = 0;
    private capacity: number = 0;

    /**
     * @constructor
     * @param {number} capacity
     */
    constructor(capacity: number) {
        this.capacity = capacity;
        this.items = new Array<number>(capacity);
    }

    /**
     * @param {number} i
     * @returns {number}
     */
    get(i: number): number {
        return this.items[i];
    }

    /**
     * @param {number} i
     * @param {number} n
     * @returns {void}
     */
    set(i: number, n: number): void {
        this.items[i] = n;
    }

    /**
     * @param {number} n
     * @returns {void}
     */
    pushback(n: number): void {
        if (this.size === this.capacity) {
            this.capacity = 2 * this.capacity;
            let newArray = new Array<number>(this.capacity);
            for (let i: number = 0; i < this.size; ++i) {
                newArray[i] = this.items[i];
            }
            newArray[this.size++] = n;
            this.items = newArray;
            return;
        }
        this.items[this.size++] = n;
    }

    /**
     * @returns {number}
     */
    popback(): number {
        let element: number = this.items[--this.size];
        return element;
    }

    /**
     * @returns {void}
     */
    resize(): void {
        let newArray = new Array<number>(2 * this.size);
        for (let i: number = 0; i < this.size; ++i) {
            newArray[i] = this.items[i];
        }
        this.items = newArray;
    }

    /**
     * @returns {number}
     */
    getSize(): number {
        return this.size;
    }

    /**
     * @returns {number}
     */
    getCapacity(): number {
        return this.capacity;
    }
}
